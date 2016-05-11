package com.bridgelabz.linklist;

/*

* created by: Bridge Labz
* Date 09/05/2016
*
* Perpose: Read .a List of Numbers from a file and arrange it ascending Order in a Linked List. Take user input for a number, if found then pop the number out of the list else insert the number in appropriate position

**/

import com.bridgelabz.model.Node;
import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.SortingFunction;

public class OrderList{

	Node<Integer> start;
	Node<Integer> prev;
	Utility mUtility;
	SortingFunction mSortingFunction;
	String fileInput;
	int[] numberList;
	public OrderList(){

		mUtility=new Utility();
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
		OrderList orderList=new OrderList();
		orderList.putIntegerToList();
		orderList.printLinkList();
		String exit=new String();
		do{
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
					if(!fidWordFromList(number)){
						//Integer is not there in list
						//Call method to add Integer in the list.
						System.out.println("Integer is not found. "+number+" is added to the list.");
						addNodeToList(number);
						printLinkList();
					}
					else{
						System.out.println("Integer is found. "+number+" is deleted from the list.");
						deleteItem();
						printLinkList();
					}
					break;

			case 2: try{
						mUtility.writeToFile(getLinkLis(),"nuberList.txt");
						System.out.println("Integer are save to wordsList.txt");
					}
					catch(Exception exception){
						System.out.println("File writing error");
					}
					break;
		}
	}

	public void putIntegerToList(){
		for(int i=0;i<numberList.length;i++){
			addNodeToList(numberList[i]);
		}
	}

	public void addNodeToList(Integer number){
		Node<Integer> temp=new Node<Integer>(number);
		Node<Integer> node1;
		if(start==null){
			//first item of the list.
			start=temp;
		}
		else{
			prev=start;
			while(prev.right!=null){
				if(number<((Integer)((prev.right).getData())))
					break;
				prev=prev.right;
			}
			if(prev.right==null){
				prev.right=temp;
			}
			else{
				node1=prev.right;
				prev.right=temp;
				prev=prev.right;
				prev.right=node1;
			}	
		}
	}

	//Print Link List
	public void printLinkList(){
		Node<Integer> last;
		if(start==null)
			System.out.println("Link list is empty.");
		else{
			last=start;
			//System.out.print("First Element in Print also "+last.getData());
			while(last.right!=null){
				System.out.print(last.getData()+" ");
				last=last.right;
			}
			System.out.println();
		}
	}

	//find word from the list (if words found then it return true else it return fasle)
	public boolean fidWordFromList(Integer key){
		if(start==null)
			return false;
		else{		
			Node<Integer> current=start;
			prev=start;
			while(current.right!=null){
				if(current.getData()==key)
					return true;
				else{
					prev=current;
					current=current.right;
				}
			}
			return false;
		}
	}

	//Give string represention of the link list
	public String getLinkLis(){
		Node<Integer> last;
		String data=new String();
		if(start==null)
			return null;
		else{
			last=start;
			while(last.right!=null){
				data=data+last.getData()+" ";
				last=last.right;
			}
			return data;
		}
	}

	public void deleteItem(){
		if(start==prev){
			//Item to be deleted is first item.
			start=(prev.right).right;
		}
		if(((prev.right).right)==null){
			//if the item to delete is last item.
			prev.right=null;
		}
		else{
			prev.right=((prev.right).right);
		}
	}
}


