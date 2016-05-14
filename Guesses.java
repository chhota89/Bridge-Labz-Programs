package com.bridgelabz.guesses;

/*

* created by: Bridge Labz
* Date 14/05/2016
*
* Perpose: Takes a command-line argument N, asks you to think of a number between 0 and N-1, where N = 2^n, and always guesses the answer with n questions.

**/

import com.bridgelabz.utility.Utility;

public class Guesses{

	public static void find(int low,int up){
    //Displaying the value
    if(low==up){
      System.out.println("Your number is : "+low);
      System.out.println("Intermediary numbers is "+(low-1)+" and "+(low+1));
      return;
    }
    //Finding middle value between range low and up
    int mid=(low+up)/2;
    int ch;
    System.out.println("Press 1 : "+low+" - "+mid);
    System.out.println("Press 2 : "+(mid+1)+" - "+up);
    ch=new Utility().inputInteger();
    //Number is in first half
    if(ch==1){
      find(low,mid);
    }
    //Number is in second half
    else{
      find(mid+1,up);
    }
	}
	public static void main(String args[]){
		System.out.println("Enter the Range  (N) :");
		int num=new Utility().inputInteger();
		find(0,num-1);
	}
}
