package com.bridgelabz.sorting;

/*

* created by: Bridge Labz
* Date 3/05/2016
*
* Perpose: To demonstrate Insertion Sort functionality.	 

**/
 
import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.SortingFunction;

public class InsertionSortDemo{

	public static void main(String args[]){
		Utility utility=new Utility();
		SortingFunction sorting=new SortingFunction();
		System.out.println("Enter Statement:");
		String statement=utility.inputWord();
		String words[]=sorting.wordsArrayFromStatement(statement);
		//Perform insertation sort on the string array
		words=sorting.insertationSort4String(words);
		System.out.println("Insertion Sort Result is:");
		//print string array
		sorting.print1DStringArray(words);
	}
}

