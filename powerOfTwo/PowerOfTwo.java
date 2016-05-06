package com.bridgelabz.powertwotable;

/*

* created by: Bridge Labz
* Date 03/05/2016
*
* Perpose: This program takes a command-line argument N and prints a table of the powers of 2 that are less than or equal to 2^N.
**/

import java.lang.*;
import com.bridgelabz.utility.Utility;
public class PowerOfTwo{
	
	public static void main(String args[]){
	int number;
		PowerOfTwo powerOfTwo=new PowerOfTwo();

		do{
			System.out.println("Enter Number (N):");
			number=new Utility().inputInteger();
		}while(!powerOfTwo.checkNumberLessthen31(number));
		powerOfTwo.printPowerOfTwo(number);
	}

	
	

	// check Number Less then 31
	public boolean checkNumberLessthen31(int number){
		if(number>31)
			return false;
		else
			return true;
	}

	
	//Power of 2 table Print
	public void printPowerOfTwo(int number){
		for(int i=0;i<number;i++){
			System.out.println("2 ^ "+i+" "+Math.pow(2,i));
			
		}
	}
}
