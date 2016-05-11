package com.bridgelabz.model;

/*

* created by: Bridge Labz
* Date 09/05/2016
*
* Perpose: model class for stack

**/

public class Stack{
	private char mCharArray[];
	int position;
	public final int SIZE=100;
	public Stack(){
		mCharArray=new char[SIZE];
		position=-1;
	}

	//push the char to stack. If stack size is full then it throws exception
	public void push(char character)throws Exception{
		position++;
		if(position==SIZE){
			throw new Exception();
		}
		mCharArray[position]=character;
	}

	//pop the element from the stack. If stack is empty then throws exception
	public char pop()throws Exception{
		if(position==-1)
			throw new Exception();
		 position--;
		 return mCharArray[position+1];			 
	}

	//return current charachter of stack.
	public char peak(){
		return mCharArray[position];
	}

	//If stack is empty then it return true other wise return false.
	public boolean isEmpty(){
		if(position==-1)
			return true;
		else 
			return false;
	}

	//return size of the stack.
	public int size(){
		return position+1;
	}
}
