package com.bridgelabz.orderlistdemo;

/*

* created by: Bridge Labz
* Date 13/05/2016
*
* Perpose: Order Link list using Double link list structure.
**/
import com.bridgelabz.utility.OrderLinKList;
import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.SortingFunction;

public class OrderListDemo{

	Utility mUtility;
	SortingFunction mSortingFunction;
	int[] numberList;
	OrderLinKList<Integer> orderLinKList;
	String fileInput;
	public OrderListDemo(){
		mUtility=new Utility();
		orderLinKList=new OrderLinKList();
		mSortingFunction=new SortingFunction();
		fileInput=mUtility.getFileText("nuberList.txt");
		if(fileInput!=null){
			numberList=genrateNumberList(fileInput.split(" "));
		}
		else{
			System.out.println("Error while reading file ...");
		}
	}

	//take string array as input and return integer array.
	public int[] genrateNumberList(String words[]){
		int[] numberlist=new int[words.length];
		for(int i=0;i<words.length;i++){
			try{
				numberlist[i]=Integer.parseInt(words[i]);
			}
			catch(NumberFormatException exception){}
		}
		return numberlist;
	}

	public static void main(String args[]){

		OrderListDemo orderList=new OrderListDemo();
		orderList.putIntegerToList();
		orderList.orderLinKList.print();
		String exit=new String();
		do{
			//display the menu to the user.
			System.out.println("1 Search words from list");
			System.out.println("2 Save the List");
			orderList.menuChoice(orderList.mUtility.inputInteger());
			System.out.println("Press E to exit");
			exit=orderList.mUtility.inputWord();
		}while(!exit.equals("E"));		
	}

	public void menuChoice(int choice){
		switch(choice){
			case 1: System.out.println("Enter the Integer to Search.");
					Integer number=mUtility.inputInteger();
					if(!orderLinKList.search(number)){
						//Integer is not there in list
						//Call method to add Integer in the list.
						System.out.println("Integer is not found. "+number+" is added to the list.");
						orderLinKList.add(number);
						orderLinKList.print();
					}
					else{
						System.out.println("Integer is found. "+number+" is deleted from the list.");
						try{
							//remove the node from the link list.
							orderLinKList.remove(number);
						}
						catch(Exception exception){}
						orderLinKList.print();
					}
					break;

			case 2: try{
						mUtility.writeToFile(orderLinKList.getLinkListString(),"nuberList.txt");
						System.out.println("Integer are save to wordsList.txt");
					}
					catch(Exception exception){
						// file not find then error will ocuured.
						System.out.println("File writing error");
					}
					break;
		}
	}

	//put integer array to the link list.
	public void putIntegerToList(){
		for(int i=0;i<numberList.length;i++){
			orderLinKList.add(numberList[i]);
		}
	}
}
