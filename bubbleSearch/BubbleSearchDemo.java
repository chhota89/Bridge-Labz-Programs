package com.bridgelabz.sorting;
 
/*

* created by: Bridge Labz
* Date 3/05/2016
*
* Perpose: To demonstrate the Bubble sort functionality.	 

**/

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.SortingFunction;

public class BubbleSearchDemo{

	public static void main(String args[]){

		Utility utility=new Utility();
		SortingFunction sorting=new SortingFunction();
		System.out.println("Enter Array Size");
		int arraySize=utility.inputInteger();
		//take int array as Input
		int array[]=sorting.input1DArray(arraySize);
		//Bubble sort 
		array=sorting.bubbleSortInAscendingOrder(array);
		//print the integer array.
		sorting.print1DArray(array);	
	}
}

