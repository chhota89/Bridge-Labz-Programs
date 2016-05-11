package com.bridgelabz.stock;

/*

* created by: Bridge Labz
* Date 05/05/2016
*
* Perpose: Write a program to read in Stock Names, Number of Share, Share Price. Print a Stock Report with total value of each Stock and the total value of Stock.

**/

import com.bridgelabz.utility.Utility;

public class Main{
	public static void main(String args[]){
		System.out.println();

		//get stock details read stock details from fie.txt and display reports.s
		System.out.println(new Utility().getStockDetails("file.txt"));
	}
}
