package com.bridgelabz.harmonic;
/*

* created by: Bridge Labz
* Date 3/05/2016
*
* Perpose: Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N 
**/

import com.bridgelabz.utility.Utility;

public class Harmonic{
	
	public static void main(String args[]){
		int number;
		Harmonic harmonic=new Harmonic();

		do{
			System.out.println("Enter Number (N):");
			number=new Utility().inputInteger();
		}while(!harmonic.checkNumberIsZero(number));
		System.out.println("Harmonic :"+harmonic.calculateHarmonic(number));
		
	}


	// check Number Is Zero
	public boolean checkNumberIsZero(int number){
		if(number==0)
			return false;
		else
			return true;
	}

	public double calculateHarmonic(int number){
		double result=0;
		for(int i=1;i<=number;i++){
			
			result=result+(1.0/i);
			System.out.println(result);
		}
		return result;
	}

	
}
