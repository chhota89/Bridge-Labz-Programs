package com.bridgelabz.vendingmachine;

/*

* created by: Bridge Labz
* Date 11/05/2016
*
* Perpose:There is 1, 2, 5, 10, 50, 100, 500 and 1000 Rs Notes which can be returned by Vending Machine. Write a Program to calculate the minimum number of Notes as well as the Notes to be returned by the Vending Machine as a Change
**/

import com.bridgelabz.utility.Utility;

public class VendingMachine{

	int mNote;

	public static void main(String args[]){
		System.out.println("Enter the Amout:");
		int amount=new Utility().inputInteger();
		VendingMachine machine=new VendingMachine();
		machine.calculateMinNoNote(amount);
		System.out.println("Minimum number of Note required is:"+machine.mNote);
	}

	public void calculateMinNoNote(int amount){
		//System.out.println("Amount is : "+amount);

		if(amount == 0)
			return;
	
		//calculate 1000 rupess notes
		if(amount>=1000){
			mNote+=((int)amount/1000);
			System.out.println("1000 Rupes Notes is: "+((int)amount/1000));
			if(amount/1000 == 0)
				return;
			else
				calculateMinNoNote(amount%1000);
		}
		
		//calculate 500 rupess notes
		else if(amount>= 500){
			mNote+=((int)amount/500);
			System.out.println("500 Rupes Notes is: "+((int)amount/500));
			if(amount/500 == 0)
				return;
			else
				calculateMinNoNote(amount%500);
		}

		//calculate 100 rupess notes
		else if(amount>= 100){
			mNote+=((int)amount/100);
			System.out.println("100 Rupes Notes is: "+((int)amount/100));
			if(amount/100 == 0)
				return;
			else
				calculateMinNoNote(amount%100);
		}

		//calculate 50 rupess notes
		else if(amount>= 50){
			mNote+=((int)amount/50);
			System.out.println("50 Rupes Notes is: "+((int)amount/50));
			if(amount/50 == 0)
				return;
			else
				calculateMinNoNote(amount%50);
		}
		
		//calculate 10 rupess notes
		else if(amount>= 10){
			mNote+=((int)amount/10);
			System.out.println("10 Rupes Notes is: "+((int)amount/10));
			if(amount/10 == 0)
				return;
			else
				calculateMinNoNote(amount%10);
		}

		//calculate 5 rupess notes
		else if(amount>= 5){
			mNote+=((int)amount/5);
			System.out.println("5 Rupes Notes is: "+((int)amount/5));
			if(amount/5 == 0)
				return;
			else
				calculateMinNoNote(amount%5);
		}

		//calculate 2 rupess notes
		else if(amount>= 2){
			mNote+=((int)amount/2);
			System.out.println("2 Rupes Notes is: "+((int)amount/2));
			if(amount/2 == 0)
				return;
			else
				calculateMinNoNote(amount%2);
		}

		//calculate 1 rupess notes
		else if(amount>= 1){
			mNote+=((int)amount/1);
			System.out.println("1 Rupes Notes is: "+((int)amount/1));
			if(amount/1 == 0)
				return;
			else
				calculateMinNoNote(amount%1);
		}
	}
}


