package com.bridgelabz.model;

/*
* created by: Bridge Labz
* Date 10/05/2016
*
* Perpose: model class for Queue
**/

public class Queue<E>{
	private E[] array;
	int front,rear;
	public final int SIZE=100;
	public Queue(){
		array=(E[])new Object[SIZE];
		front=-1;
		rear=-1;
	}

	
	//push the char to stack. If queue size is full then it throws exception
	public void enQueue(E item)throws Exception{
		//check queue is full
		rear++;
		if(rear==SIZE){
			throw new Exception();
		}
		if(rear==0)
			front=0;

		array[rear]=item;

	}
	
	//pop the element from the stack. If stack is empty then throws exception
	public E deQueue()throws Exception{
		//if front less then or equal to rear
		if(front <= rear){
			front++;
			return array[front-1];
		}else{
			throw new Exception();
		}
				 
	}
	
	

	//If stack is empty then it return true other wise return false.
	public boolean isEmpty(){
		if(rear==-1)
			return true;
		else if(front>rear)
			return true;
		else
			return false;
	}
	
	//return size of the stack.
	public int size(){
		if(isEmpty())
			return 0;
		else
			return rear-front+1;
	}
	/*
	//return current charachter of stack.
	public char peak(){
		return mCharArray[position];
	}
	**/
}
