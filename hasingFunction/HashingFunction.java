package com.bridgelabz.hasing;

/*

* created by: Bridge Labz
* Date 13/05/2016
*
* Perpose:  Create a Slot of 10 to store Chain of Numbers that belong to each Slot to efficiently search a number from a given set of number
**/

import com.bridgelabz.utility.OrderLinKList;
import com.bridgelabz.utility.Utility;
import java.util.ArrayList;

public class HashingFunction{

	ArrayList<OrderLinKList> mList;

	public HashingFunction(){
		mList=new ArrayList<OrderLinKList>();
	}

	public static void main(String args[]){
		HashingFunction hashingFunction=new HashingFunction();
		hashingFunction.putElementsInTheList();
		OrderLinKList orderLinKList;
		//System.out.println("Size is :"+hashingFunction.mList.size());
		while(true){
			System.out.println("Enter number to search");
			int number=new Utility().inputInteger();
			int reminder=number%11;
			try{
				orderLinKList=hashingFunction.mList.get(reminder);
				boolean found=orderLinKList.search(new Integer(number));
				System.out.println((found)? "Words is found" : "Words is not found");

				if(found){
					try{
						orderLinKList.remove(new Integer(number));
						System.out.println(number+" is deleted.");
					}
					catch(Exception exception){
						//System.out.println("Error in deleting "+number);
					}
					
				}
				else{
					orderLinKList.add(new Integer(number));
					System.out.println("Number is add to the List at hasing reminder is "+reminder);
				}
			}
			catch(Exception exception){
				System.out.println("Exception occurs");
			}
			hashingFunction.printTheHashMap();
			System.out.println();
		}
	}

	public  void putElementsInTheList(){
		for(int i=0;i<11;i++)
			mList.add(new OrderLinKList<Integer>());
	}

	public  void printTheHashMap(){
		for(int i=0;i<11;i++){
			System.out.print(i+" --> ");
			mList.get(i).print();
		}
	}
}


