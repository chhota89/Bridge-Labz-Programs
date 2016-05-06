package com.bridgelabz.primefactor;
/*

* created by: Bridge Labz
* Date 06/05/2016
*
* Perpose: Computes the prime factorization of N using brute force.
**/

import com.bridgelabz.utility.Utility;

public class PrimeFactor{
	public static void main(String args[]){
		System.out.println("Enter Number (N)");
		Utility utility=new Utility();
		int number=utility.inputInteger();
		System.out.println("Prime factor of "+number+" is :");
		findPrimeFactor(number);
	}
	
	//function to calulate prime factor of number
	public static void findPrimeFactor(int number){
		for(int i=1;i*i<=number;i++){
			if(number%i==0)
				System.out.print(" "+i);
		}
	}
}
