package com.bridgelabz.linklist;

/*

* created by: Bridge Labz
* Date 09/05/2016
*
* Perpose: Read the Text from a file, split it into words and arrange it as Linked List. Take a user input to search a Word in the List. 
*If the Word is not found then add it to the list, and if it found then remove the word from the List. 
*In the end save the list into a file


**/

import com.bridgelabz.model.Node;
import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.SortingFunction;
public class UnOrderList{

	Node<String> start,prev;
	Utility mUtility;
	SortingFunction mSortingFunction;
	String fileInput,words[];

	public UnOrderList(){
		mUtility=new Utility();
		mSortingFunction=new SortingFunction();
		fileInput=mUtility.getFileText("wordsList.txt");
		if(fileInput!=null){
			//words=mSortingFunction.wordsArrayFromStatement(fileInput);
			words=fileInput.split(" ");
		}
		else{
			System.out.println("Error while reading file ...");
		}
	}

	public static void main(String args[]){
		UnOrderList unOrderList=new UnOrderList();
		unOrderList.putWordsInLinkList();
		unOrderList.printLinkList();
		String exit=new String();
		do{
			System.out.println("1 Search words from list");
			System.out.println("2 Save the List");
			unOrderList.menuChoice(unOrderList.mUtility.inputInteger());
			System.out.println("Press E to exit");
			exit=unOrderList.mUtility.inputWord();
		}while(!exit.equals("E"));

	}

	public void menuChoice(int choice){
		switch(choice){
			case 1: System.out.println("Enter the word to Search.");
					String word=mUtility.inputWord();
					if(!fidWordFromList(word)){
						//word is not there in list
						//Call method to add word in the list.
						System.out.println("Word is not found. "+word+" is added to the list.");
						addNodeToList(word);
						printLinkList();
					}
					else{
						System.out.println("Word is found. "+word+" is deleted from the list.");
						deleteItem();
						printLinkList();
					}
					break;

			case 2: try{
						mUtility.writeToFile(getLinkLis(),"wordsList.txt");
						System.out.println("Words are save to wordsList.txt");
					}
					catch(Exception exception){
						System.out.println("File writing error");
					}
					break;
		}
	}

	public void putWordsInLinkList(){
		Node<String> temp;
		Node<String> last=new Node<String>();
		for(int i=0;i<words.length;i++){
			temp=new Node<String>(words[i]);
			if(start==null){
				start=temp;
				last=start;
			}
			last.right=temp;
			last=last.right;
		}
	}

	//Give string represention of the link list
	public String getLinkLis(){
		Node<String> last;
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

	//Print Link List
	public void printLinkList(){
		Node<String> last;
		if(start==null)
			System.out.println("Link list is empty.");
		else{
			last=start;
			while(last.right!=null){
				System.out.print(last.getData()+" ");
				last=last.right;
			}
			System.out.println();
		}
	}

	//find word from the list (if words found then it return true else it return fasle)
	public boolean fidWordFromList(String key){
		if(start==null)
			return false;
		else{		
			Node<String> current=start;
			prev=start;
			while(current.right!=null){
				if(current.getData().equals(key))
					return true;
				else{
					prev=current;
					current=current.right;
				}
			}
			return false;
		}
	}

	public void addNodeToList(String word){
		Node<String> temp=new Node<String>(word);
		if(start==null){
			//List is empty
			start=temp;
		}
		else{
			//Add element to the end of the list
			/*
			prev.right=null;
			if(prev.right==null)
				System.out.println("Node adding is done...........");

			System.out.println("Previous position is:..."+prev.getData());
			prev.right=temp;
			**/
			prev=start;
			while((prev.right).right!=null){
				//System.out.print(prev.getData()+" ");
				prev=prev.right;
			}
			(prev.right).right=temp;
			(prev.right).setData(word);
		}
	}

	public int size(){
		Node<String> prev=start; int n=0;
			while((prev.right).right!=null){
				prev=prev.right;
				n++;
			}
		return n;
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
