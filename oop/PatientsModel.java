package com.bridgelabz.model;

/*

* created by: Bridge Labz
* Date 5/05/2016
*
* Perpose: This model is used for storing Patients details.	 

**/

import com.bridgelabz.utility.Utility;
public class PatientsModel{
	private int id,age;
	private String mobileNumber;
	Utility utility;

	public PatientsModel(){
		utility=new Utility();
		System.out.println("Enter Patients Details ...");

		System.out.print("Enter Id: ");
		this.id=utility.inputInteger();
		System.out.println();

		System.out.print("Enter Mobile Number: ");
		this.mobileNumber=utility.inputWord();
		System.out.println();

		System.out.print("Enter age: ");
		this.age=utility.inputInteger();
		System.out.println();
	}

	public int getId(){
		return id;
	}

	public String getmobileNumber(){
		return mobileNumber;
	}

	public int getAge(){
		return age;
	}

	public String toString(){
		return id+"     "+mobileNumber+"     "+age+"\n";
	}
}
