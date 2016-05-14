package com.bridgelabz.utility;

/*

* created by: Bridge Labz
* Date 13/05/2016
*
* Perpose: Order Link list using Double link list structure.
**/
import com.bridgelabz.model.Node;
public class OrderLinKList<E>{

	private Node head;
    private Node tail;
    private int size;


	//add elemnts to the link list.
	public void add(E item){
		Node temp = new Node(item, null, null);
		size++;
		if(head==null){
			head=temp;
			tail=temp;
		}
		else{
			Node trav=head;
			if(item instanceof Integer)
				while(trav!=null){
					if((Integer)trav.getData() > (Integer)item){
						//wants to add integer in between the number
						// 8 -> 10 and add 9
						temp.right=trav;
						temp.left=trav.left;
						if(trav.left!=null)
							(trav.left).right=temp;
						else
							head=temp;

						trav.left=temp;
						return;
					}	
					trav=trav.right;
				}// end of while loop
			if((Integer)item  > (Integer)tail.getData()){
				// Put elements last of the link list.
				temp.left=tail;
				tail.right=temp;
				tail=temp;
			}
			else{
				//Put the elemnts start of the link list.
				temp.left=null;
				temp.right=head;
				head=temp;
			}
		}
	}// end of the add function.

	//search method return true if elements found in the list otherwise return false.
	public boolean search(E item){
		if(head==null){
			return false;
		}
		else{
			Node trav=head;
			while(trav!=null){

				if(((Integer)trav.getData()).compareTo((Integer)item) == 0){
					return true;
				}
				trav=trav.right;
			}
			return false;
		}
	}

	//Remove the elemnts from the link list.
	public void remove(E item)throws Exception{
		if(head==null)
			throw new Exception();
		else{
			Node trav=head;
			while(trav!=null){
				if(((Integer)trav.getData()).compareTo((Integer)item) == 0){
					if(head==trav){
						(trav.right).left=head;
						head=head.right;
						size--;
						return;
					}
					else if(tail==trav){
						(trav.left).right=null;
						tail=tail.left;
						size--;
						return;
					}
					else{
						(trav.left).right=trav.right;
						(trav.right).left=trav.left;
						size--;
						return;
					}	
				}		
				trav=trav.right;
			}
			throw new Exception();
		}
	}

	//Return string of the link list.
	public String getLinkListString(){
		Node trav=head;
		String temp=new String();
		while(trav!=null){
			temp+=trav.getData()+" ";
			trav=trav.right;
		}
		return temp;
	}

	//return the size of tthe link list
	public int size(){
		return size;
	}

	//Print the link list
	public void print(){
		Node trav=head;
		while(trav!=null){
			System.out.print(trav.getData()+" ");
			trav=trav.right;
		}
		System.out.println();
	}
}
