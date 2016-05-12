package com.bridgelabz.palindrome;

/*

* created by: Bridge Labz
* Date 12/05/2016
*
* Perpose: A palindrome is a string that reads the same forward and backward, for example, radar, toot, and madam. We would like to construct an algorithm to input a string of characters and check whether it is a palindrome.

**/

import com.bridgelabz.utility.UnOrderLinKList;
import com.bridgelabz.utility.Utility;
public class Palindrome{

	UnOrderLinKList<String> mUnOrderList;

	public Palindrome(){
		mUnOrderList=new UnOrderLinKList<String>();
	}

	public static void main(String args[]){
		System.out.println("Enter the String: ");
		String statement=new Utility().inputWord(); 
		Palindrome palindrome=new Palindrome();
		palindrome.putCharacterToTheList(statement);
		System.out.println(palindrome.checkPalindrome()? "Palindrome" : "Not Palindrome");
	}

	public void putCharacterToTheList(String statement){
		for(int i=0;i<statement.length();i++)
			mUnOrderList.add(""+statement.charAt(i));
	}

	public boolean checkPalindrome(){
		//calculate traversal for even or odd.
		int endLimit=(mUnOrderList.size()%2==0)? 0 : 1;

		while(mUnOrderList.size()>endLimit){
			try{
				//remove first and last elemnts and compare
				if(!((String)mUnOrderList.remove()).equals(((String)mUnOrderList.removeLast()))){ 
					//if first and last elements are not euqlas then return false.
					return false;
				}
			}catch(Exception exception){
				return false;
			}
		}
		return true;
	}
}
