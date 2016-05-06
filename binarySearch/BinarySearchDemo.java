package com.bridgelabz.sorting;

/*

* created by: Bridge Labz
* Date 4/05/2016
*
* Perpose: To demonstrate the binary serach functionality.	 

**/
import java.util.Arrays;
import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.SortingFunction;

public class BinarySearchDemo{

	public static void main(String args[]){
		Utility utility=new Utility();
		SortingFunction sorting=new SortingFunction();
		System.out.println("Enter Array Size");
		int arraySize=utility.inputInteger();

		//take string array as Input
		String array[]=sorting.input1DStringArray(arraySize);
		Arrays.sort(array); //sort Array in ascending order
		sorting.print1DStringArray(array);
		System.out.println("Enter Key");
		
		//Search for the keyword in array using binary search algo.
		int position=sorting.binarySearchString(array,utility.inputWord());
		if(position==-1)
			System.out.println("Not Found");
		else
			System.out.println("Found at "+position);
	}
}

