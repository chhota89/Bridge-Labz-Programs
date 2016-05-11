package com.bridgelabz.sortingdemo;

/*

* created by: Bridge Labz
* Date 06/05/2016
*
* Perpose: Check using Stopwatch the Elapsed Time for every method call
**/

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.SortingFunction;

public class SortingsFunctionDemo{

	Utility mUtility;
	SortingFunction mSortingFunction;

	public SortingsFunctionDemo(){
		mUtility=new Utility();
		mSortingFunction=new SortingFunction();
	}

	public static void main(String args[]){
		SortingsFunctionDemo sortingsFunctionDemo=new SortingsFunctionDemo();
		String exit="";
		do{
			System.out.println();
			System.out.println("1: Binary search for Integer");
			System.out.println("2: Binary search for String");
			System.out.println("3: Insertion Sort search for Integer");
			System.out.println("4: Insertion Sort search for String");
			System.out.println("5: Bubble Sort search for Integer");
			System.out.println("6: Bubble Sort search for String");
			System.out.println();
			System.out.println("Enter yout Choice");
			sortingsFunctionDemo.menuChoice(sortingsFunctionDemo.mUtility.inputInteger());
			System.out.println("Press E to exit");
			exit=sortingsFunctionDemo.mUtility.inputWord();
		}while(!exit.equals("E"));
	}

	public void menuChoice(int choice){
		long startTime=0,endTime=0;
		int array[],key=0;
		String stringArray[],stringKey;
		System.out.println("Enter Array size");
		//Array size as Input.
		int size=mUtility.inputInteger();
		switch(choice){
			case 1:	//Genrate random array of integer
					array=mUtility.getRandomArray(size);
					System.out.println("Enter value to serch");
					key=mUtility.inputInteger();
					//store start time in startTimeVariabe
					startTime=System.currentTimeMillis();
					//Binary Serch for Integer
					System.out.println("Found at position: "+mSortingFunction.binarySearch(array,key));
					//store end time in startTimeVariabe
					endTime=System.currentTimeMillis();
					System.out.println("Elapsed Time is :"+calculateElapsedTime(startTime,endTime));
					break;
		
			case 2:	//String array as input
					stringArray=mSortingFunction.input1DStringArray(size);
					System.out.println("Enter value to serch");
					stringKey=mUtility.inputWord();
					//store start time in startTimeVariabe
					startTime=System.currentTimeMillis();
					//Binary Serch for Integer
					System.out.println("Found at position: "+mSortingFunction.binarySearchString(stringArray,stringKey));
					//store end time in startTimeVariabe
					endTime=System.currentTimeMillis();
					System.out.println("Elapsed Time is :"+calculateElapsedTime(startTime,endTime));
					break;
			
			
			case 3: //Genrate random array of integer
					array=mUtility.getRandomArray(size);
					//store start time in startTimeVariabe
					startTime=System.currentTimeMillis();
					//insertation Sort for Integer
					mSortingFunction.insertationSort(array);
					//store end time in startTimeVariabe
					endTime=System.currentTimeMillis();
					System.out.println("Elapsed Time is :"+calculateElapsedTime(startTime,endTime));
					break;
			

			case 4: //String array as input
					stringArray=mSortingFunction.input1DStringArray(size);
					//store start time in startTimeVariabe
					startTime=System.currentTimeMillis();
					//insertation Sort for Integer
					mSortingFunction.insertationSort4String(stringArray);
					//store end time in startTimeVariabe
					endTime=System.currentTimeMillis();
					System.out.println("Elapsed Time is :"+calculateElapsedTime(startTime,endTime));
					break;

			case 6: //String array as input
					stringArray=mSortingFunction.input1DStringArray(size);
					//store start time in startTimeVariabe
					startTime=System.currentTimeMillis();
					//insertation Sort for Integer
					mSortingFunction.bubbleSortInAscendingOrderString(stringArray);
					//store end time in startTimeVariabe
					endTime=System.currentTimeMillis();
					System.out.println("Elapsed Time is :"+calculateElapsedTime(startTime,endTime));
					break;
		
			case 5: //Genrate random array of integer
					array=mUtility.getRandomArray(size);
					System.out.println("Original");
					mSortingFunction.print1DArray(array);
					//store start time in startTimeVariabe
					startTime=System.currentTimeMillis();
					//insertation Sort for Integer
					array=mSortingFunction.bubbleSortInAscendingOrder(array);
					mSortingFunction.print1DArray(array);
					System.out.println();
					System.out.println("sorted");
					//store end time in startTimeVariabe
					endTime=System.currentTimeMillis();
					System.out.println("Elapsed Time is :"+calculateElapsedTime(startTime,endTime));
					break;
			
		}
	}

	public long calculateElapsedTime(long startTime,long endTime){
		return endTime-startTime;
	}
}
