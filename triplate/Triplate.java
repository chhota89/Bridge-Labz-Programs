package com.bridgelabz.triplate;


/*

* created by: Bridge Labz
* Date 4/05/2016
*
* Perpose: Find distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0

**/

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.SortingFunction;
public class Triplate{

	public static void main(String args[]){
		Utility utility=new Utility();
		SortingFunction sortingFunction=new SortingFunction();
		System.out.println("Enter Size of Array (N):");
		int arraySize=utility.inputInteger();
		int array[]=sortingFunction.input1DArray(arraySize);
		System.out.println("Array is:");
		sortingFunction.print1DArray(array);
		System.out.println();
		System.out.println("Number of triplate:"+findDistinctTriples(array));

	}

	public static int findDistinctTriples(int array[]){
		int n=0;
		for(int i=0;i<array.length-2;i++)
			if(array[i]+array[i+1]+array[i+2]==0){
						System.out.println(array[i]+" "+array[i+1]+" "+array[i+2]+" = "+"0");
						n++;
					}
		return n;
	}
	/*
	public static int findDistinctTriples(int array[]){
		int n=0;
		for(int i=0;i<array.length-3;i++){
			for(int j=i+1;i<array.length-2;j++){
				for(int k=j+1;k<array.length-1;k++){
					if(array[i]+array[j]+array[k]==0){
						System.out.println(i+" "+j+" "+k+" = "+"0");
						n++;
					}
				}
			}
		}
		return n;

	}
	**/

	
}
