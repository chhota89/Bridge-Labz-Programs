package com.bridgelabz.gamblerproblem;

/*

* created by: Bridge Labz
* Date 6/05/2016
*
* Perpose:  Simulates a gambler who start with $stake and place fair $1 bets until he/she goes broke (i.e. has no money) or reach $goal. 
* Keeps track of the number of times he/she wins and the number of bets he/she makes. Run the experiment N times, averages the results, 
* and prints them out.
**/

import com.bridgelabz.utility.Utility;
import java.lang.Math;
public class Gambler{

	double betPrice,stack,goal;
	int numberOfPlay;
	Utility utility;

	//constructor to initalize variables. It input from user
	public Gambler(){
		utility=new Utility();
		System.out.println("Enter stack Price");
		stack=utility.inputDouble();

		System.out.println("Enter stack Goal");
		goal=utility.inputDouble();

		System.out.println("Enter stack bet price");
		betPrice=utility.inputDouble();
	}
	public static void main(String args[]){
		Gambler gambler=new Gambler();
		gambler.playGame();
		gambler.printResult();
	}


	//This function return true(Win) when probability is less then 0.5 else return false(loss)
	public boolean winOrloss(){
		if(Math.random()<0.5)
			return true;
		else
			return false;
	}

	//function to demonstrate glambler.
	public void playGame(){
		numberOfPlay++;	
		if(winOrloss())
			stack+=betPrice;
		else
			stack-=betPrice;
		if(stack<=0 || stack>=goal)
			return;
		else
			playGame();
	}

	//print the gambler result
	public void printResult(){
		System.out.println("Number of time Game play is:"+numberOfPlay);
		System.out.println("Stack is:"+stack);
		System.out.println("Goal is:"+goal);
		System.out.println("Bet Price is:"+betPrice);
	}
}
