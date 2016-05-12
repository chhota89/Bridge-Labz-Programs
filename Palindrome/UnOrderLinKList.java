package com.bridgelabz.utility;

/*

* created by: Bridge Labz
* Date 12/05/2016
*
* Perpose: Un Order Link List implementation. 

**/

import com.bridgelabz.model.Node;

public class UnOrderLinKList<E>{

    private Node head;
    private Node tail;
    private int size;

	//add elemnts to the start of the link List.
	public void add(E element){
		Node temp = new Node(element, head, null);
		if(head!=null){
			//Add first element as temp
			head.left=temp;
		}
		head=temp;
		if(tail==null){
			//if elemnts enter is first element then tail is also pointing to the first elemnts.
			tail=temp;
		}
		size++;
	}

	//Add element to the end of the the list
	public void addLast(E data){
		Node temp=new Node(data,null,tail);
		if(tail != null)
			tail.right=temp;
		tail=temp;
		if(head == null) 
		{
			head = temp;
		}
		size++;
	}

	//Remove the first elements from the list.
	public E remove()throws Exception{
		 if (size == 0) 
			throw new Exception();
		Node temp=head;
		head=head.right;
		head.left=null;
		size--;

		return (E)temp.getData();
	}

	//Remove the last elemnts from the list.
	public E removeLast()throws Exception{
		if(size==0)
			throw new Exception();
		Node temp=tail;
		tail=tail.left;
		tail.right=null;
		size--;
		return (E)temp.getData();
	}


	public void print(){
		Node tmp = head;
        while(tmp != null){
            System.out.println(tmp.getData());
            tmp = tmp.right;
        }
	}

	public int size() { return size; }

	public boolean isEmpty(){ return size == 0; }
	
     
}
