package com.bridgelabz.cupons;

/*
* created by: Bridge Labz
* Date 5/05/2016

Perpose: Given N distinct Coupon Numbers, how many random numbers do you need to generate distinct coupon number? 
This program simulates this random process.

**/


import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import com.bridgelabz.utility.Utility;

public class CuponsNumber{

	private ArrayList<Integer> mListOfCupons;
	private int mCounter;
	
	public CuponsNumber(){
		mListOfCupons=new ArrayList<Integer>();
	}
	public static void main(String args[]){
		CuponsNumber cuponsNumber=new CuponsNumber();
		Utility utility=new Utility();
		System.out.println("How many cupons (N): ");
		int numberOfCupons=utility.inputInteger();
		System.out.println("Random number require to genrate "+numberOfCupons+" is :"+cuponsNumber.
			genrateDistictCupons(numberOfCupons));
	}
	
	//This method genrate positiverandom number
	public static int randomNumberGenrator(){
		//int randomNumber=new Random().nextInt();
		int randomNumber=ThreadLocalRandom.current().nextInt(0, 1000);
		if(randomNumber<0)
			randomNumber=randomNumber*(-1);
		return randomNumber;
	}
	
	//this function gentate distict cupons
	/*
		Function take numberOfCupons as input(numberOfCupons).
		return how many random number require to genrate numberOfCupons cupons
	**/
	public int genrateDistictCupons(int numberOfCupons){
		while(mListOfCupons.size()!=numberOfCupons){
			
			int randomNumber=CuponsNumber.randomNumberGenrator();
			//System.out.print(randomNumber+" ");
			if(mListOfCupons.contains(randomNumber)){
				mCounter++;
			}
			else{
				mCounter++;
				mListOfCupons.add(numberOfCupons);
			}
		}
		return mCounter;
	}
}
