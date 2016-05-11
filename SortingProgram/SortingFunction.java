package com.bridgelabz.utility;

/*

* created by: Bridge Labz
* Date 4/05/2016
*
* Perpose: Providing functionality related to Array
	1: Read string and int array.
	2: Display string and int array
	3: sorting algo (bubble, insertaion sort, binary serach)
	4: Statement to array of word	 

**/

import com.bridgelabz.utility.Utility;
import java.util.StringTokenizer;
  
public class SortingFunction{

	Utility mtility;
	StringTokenizer mTok;
	public SortingFunction(){
		mtility=new Utility();
	}
	//Take 1D Array Input
	public int[] input1DArray(int arraySize){
		int array[]=new int[arraySize];
		for(int i=0;i<arraySize;i++){
			System.out.println("Enter array["+i+"] : ");
			array[i]=mtility.inputInteger();
		}
		return array;
	}

	//Insertation sort for String
	public String[] insertationSort4String(String words[]){
		String temp;
		for(int i=1;i<words.length;i++){
			for(int j=i;j>0;j--){
				if(words[j].compareTo(words[j-1])<0){
					temp=words[j];
					words[j]=words[j-1];
					words[j-1]=temp;
				}
				else
					break;
			}
		}
		return words;
	}

	//Insertation sort
	public int[] insertationSort(int words[]){
		int temp;
		for(int i=1;i<words.length;i++){
			for(int j=i;j>0;j--){
				if((words[j]-words[j-1])<0){
					temp=words[j];
					words[j]=words[j-1];
					words[j-1]=temp;
				}
				else
					break;
			}
		}
		return words;
	}

	//Take 1D String Array Input
	public String[] input1DStringArray(int arraySize){
		String array[]=new String[arraySize];
		for(int i=0;i<arraySize;i++){
			System.out.println("Enter array["+i+"] : ");
			array[i]=mtility.inputWord();
		}
		return array;
	}

	//Print 1D array
	public void print1DArray(int array[]){
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
		System.out.println();
		System.out.println();
		System.out.println();
	}
	
	//print 1D array String
	public void print1DStringArray(String array[]){
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
		System.out.println();
	}

	//Binary Search
	public int binarySearch(int[] inputArr, int key) {
        	int start = 0;
        	int end = inputArr.length - 1;
        	while (start <= end) {
            		int mid = (start + end) / 2;
            		if (key == inputArr[mid]) {
                		return mid;
            		}
            		if (key < inputArr[mid]) {
               			 end = mid - 1;
            		} else {
               			 start = mid + 1;
            		}
        	}
         return -1;
   	 }

	//Binary Search for String
	public int binarySearchString(String[] names, String key) {
    		int first = 0;
    		int last  = names.length;
 
    		while (first < last) {
        		int mid = (first + last) / 2;
        		if (key.compareTo(names[mid]) < 0) {
           			 last = mid;
        		} else if (key.compareTo(names[mid]) > 0) {
            			first = mid + 1;
        		} else {
            			return mid;
        		}
    		}		
    		return -1;
	}

	//Bubble Sort for Integer
	public int[] bubbleSortInAscendingOrder(int numbers[])
   	 {
        int temp;
        for(int i = 0; i < numbers.length; i++)
       	{
            for(int j = 1; j < (numbers.length -i); j++)
            {
            	//if numbers[j-1] > numbers[j], swap the elements
        		if(numbers[j-1] > numbers[j])
    			{
    				temp = numbers[j-1];
   					numbers[j-1]=numbers[j];
    				numbers[j]=temp;
    			}
   		 	}
    	}
		return numbers;
	}

	//Bubble Sort for String
	public String[] bubbleSortInAscendingOrderString(String numbers[])
   	 {
        String temp;
        for(int i = 0; i < numbers.length; i++)
       	{
            for(int j = 1; j < (numbers.length -i); j++)
            {
            	//if numbers[j-1] > numbers[j], swap the elements
        		if(numbers[j-1].compareTo(numbers[j])<0)
    			{
    				temp = numbers[j-1];
   					numbers[j-1]=numbers[j];
    				numbers[j]=temp;
    			}
   		 	}
    	}
		return numbers;
	}

	//Take Statement And return Array of words
	public String[] wordsArrayFromStatement(String statement){	
		mTok=new StringTokenizer(statement," ");
		String words[]=new String[mTok.countTokens()];
		int i=0;
		while(mTok.hasMoreTokens()){
			words[i]=mTok.nextToken();
			i++;
		}
		return words;
	}
}
