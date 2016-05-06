package com.bridgelabz.percentage;

/*

* created by: Bridge Labz
* Date 03/05/2016
*
* Perpose: Use Random Function to get value between 0 and 1. If < 0.5 then tails or heads

**/

import java.util.Random;
import com.bridgelabz.utility.Utility;

public class PercentageHeadsTail{

	public static void main(String args[]){
		int number=0;
		
		 Utility utility=new Utility();
		 PercentageHeadsTail percentageHeadsTail=new PercentageHeadsTail();
		 
			do{
				System.out.println("Enter number of times to Flip Coin:");
				number=utility.inputInteger();
			}while(!percentageHeadsTail.ValidatePositiveNumber(number));
		
		int tail = percentageHeadsTail.numberOfTail(number);
		double percentageTial = percentageHeadsTail.percentageOfTail(tail,number);

		System.out.println("Percentage of time tial :"+percentageTial);
		System.out.println("Percentage of time Head :"+(100-percentageTial));
	}

	//Calculate the number of Tail
	public int numberOfTail(int number){
		int tail=0;
		Random random=new Random();
		for(int i=0;i<number;i++){
			if(random.nextInt()<0.5)
				tail++;
		}
		return tail;
	}

	//Calculate the percentage of Tail
	public double percentageOfTail(int tail,int number){
		return (100*tail)/number;
		
	}

	//Method to validate Number is Positive
	public boolean ValidatePositiveNumber(int number){
		if(number>0)
			return true;
		else
			return false;
	}

}
