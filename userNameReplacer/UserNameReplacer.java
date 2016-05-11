package com.bridgelabz.namereplacer;

/*

* created by: Bridge Labz
* Date 3/05/2016
*
* Perpose: this rogram replace "UserName" with actual user name.

**/
import com.bridgelabz.utility.Utility;
public class UserNameReplacer{

public static final String TEMPLATE="Hello UserName, How are you?";

	public static void main(String args[]){
		String UserName=new String();
		do{
			System.out.println("Enter The UserName: ");
			UserName=new Utility().inputWord();
		}while(checkLengthOfUserName(UserName));

		System.out.println("Input is correct");

		stringReplacer(UserName);		
		
	}

	//Checking lenth of the User Name
	public static boolean checkLengthOfUserName(String UserName){
		if(UserName.length()<3){
			System.out.println("UserName lenght should grater then 3");
			return true;
		}
		else{
			return false;
		}
	}
	
	//Replace the template by UserName
	public static void stringReplacer(String userName){
		System.out.println(TEMPLATE.replaceAll("UserName",userName));
	}
}
