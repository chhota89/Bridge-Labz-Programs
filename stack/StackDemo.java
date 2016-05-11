package com.bridgelabz.stackdemo;

/*

* created by: Bridge Labz
* Date 10/05/2016
*
* Perpose: Take an Arithmetic Expression such as (5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3) where parentheses are used to order the 
* performance of operations. Ensure parentheses must appear in a balanced fashion

**/

import com.bridgelabz.model.Stack;
import com.bridgelabz.utility.Utility;
public class StackDemo{

	Stack mStack;

	public StackDemo(){
		mStack=new Stack();
	}

	public static void main(String args[]){
		Utility utility=new Utility();
		System.out.println("Enter the expression :");
		String expression=utility.inputWord();
		StackDemo stackDemo=new StackDemo();

		if(stackDemo.checkPerentheses(expression))
			System.out.println("Balance parentheses");
		else
			System.out.println("not Balance parentheses");
	}

	//return true if parentheses is balance else return false.
	public boolean checkPerentheses(String expression){
		for(int i=0;i<expression.length();i++){
			char ch=expression.charAt(i);
			if(ch=='(' || ch=='{'){
				try{
					mStack.push(ch);
					System.out.println(ch+" postion of array is: "+mStack.size());
				}catch(Exception exception){
					//stack size is full
					System.out.println("Array index out of bound exception.");
				}
			}

			if(ch==')' || ch=='}'){
				try{
					char a=mStack.pop();
					System.out.println(a+" postion of array is: "+mStack.size());
				}catch(Exception exception){
					return false; //No element is there in stack.
				}
			}
		}

		System.out.println("postion of array is: "+mStack.size());
		if(mStack.isEmpty())
				return true;
			else
				return false;
	}
}
