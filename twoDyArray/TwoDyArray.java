package com.bridgelabz.printwriter;

/*
Perpose: 1: This function will take 2D array as input.
		2: And print the 2D array using PrintWriter.
**/

import com.bridgelabz.utility.Utility;
import java.io.PrintWriter;
public class TwoDyArray{
	int mArray[][];
	int m,n;
	Utility mUtility;
	PrintWriter mPrintWriter;
	public TwoDyArray(int m,int n){
		mArray=new int[m][n];
		this.m=m;	
		this.n=n;
		printWriter=new PrintWriter(System.out,true);
		mUtility=new Utility();
	}

	public static void main(String args[]){
		Utility utility=new Utility();
		System.out.println("Enter number of Column:");
		int n=utility.inputInteger();

		System.out.println("Enter number of Row:");
		int m=utility.inputInteger();
		TwoDyArray twoDyArray=new TwoDyArray(m,n);
		twoDyArray.takeArrayInput();
		System.out.println("2D Array is");
		twoDyArray.printArray();
	}
	
	//Take 2D Array as Input
	public void takeArrayInput(){
		for(int row=0;row<m;row++){
			for(int col=0;col<n;col++){
				System.out.print("Array["+row+"] ["+col+"] :");
				mArray[row][col]=mUtility.inputInteger();
				System.out.println();
			}
		}
	}

	public void printArray(){
    	//PrintWriter writer = new PrintWriter(new OutputStreamWriter(output, "UTF-8"));	
		for(int row=0;row<m;row++){
			for(int col=0;col<n;col++){
				mPrintWriter.print(" "+mArray[row][col]);
			}
			mPrintWriter.println();
		}
	}
}
