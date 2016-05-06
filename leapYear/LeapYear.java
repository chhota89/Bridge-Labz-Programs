package com.bridgelabz.leapyear;

/*

* created by: Bridge Labz
* Date 3/05/2016
*
* Perpose: Determine if it is a Leap Year.	 

**/

import com.bridgelabz.utility.Utility;

public class LeapYear{

	public static void main(String args[]){
		int year;
		Utility utility=new Utility();
		LeapYear leapYear=new LeapYear();		
		do{
			System.out.println("Enter Year");
			year=utility.inputInteger();
		}while(!leapYear.checkFourDigitNumber(year));

		if(leapYear.checkLeapYear(year))
			System.out.println(year+" is Leap Year");
		else
			System.out.println(year+" is not Leap Year");		

	}


	// Check for 4 digit number
	public boolean checkFourDigitNumber(int year){
		if(year<1000)
			return false;
		else
			return true;
	}

	
	/*
		Condition for Leap Year
		1. A year is a leap year if it is divisible by 4 but not by 100. 
		2. If a year is divisible by both 4 and by 100, then it can only be a leap year if it is also divisible by 400. 
	**/

	//Check for Leap year
	public boolean checkLeapYear(int year){
		 if(((year%4==0)&&(year%100!=0))||(year%400==0))
			return true;
		else
			return false;
	}
}
