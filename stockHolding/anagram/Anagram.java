package com.bridgelabz.anagram;

/*

* created by: Bridge Labz
* Date 09/05/2016
*
* Perpose: An Anagram Detectio

*One string is an anagram of another if the second is simply a rearrangement of the first. For example, 'heart' and 'earth' are anagrams	 

**/

import com.bridgelabz.utility.Utility;

public class Anagram{
	public static void main(String args[]){

		Utility utility=new Utility();
		System.out.println("Enter first word: ");
		String first=utility.inputWord();
		System.out.println("Enter Second word");
		String second=utility.inputWord();
		System.out.println(detectAnagram(first,second)? "Words are Anagram" : "Words are not Anagram");
	}

	public static boolean detectAnagram(String first,String second){

		//If length of both words are not same then they are not anagram.
		if(first.length()!=second.length())
			return false;

		for(int i=0;i<second.length();i++){
			char c=first.charAt(i);
			if(second.indexOf(c)==-1)
				return false;
		}

		return true;
	}
}



