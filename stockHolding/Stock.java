package com.bridgelabz.model;

import com.bridgelabz.utility.Utility;
public class Stock{

	private String stockName;
	private int stockPrice;
	private int stockNumber;
	Utility utility;
	public Stock(String stockName){
		this.stockName=stockName;
		utility=new Utility();

		System.out.println("Enter stock Price:");
		this.stockPrice=utility.inputInteger();

		System.out.println("Enter stock Number:");
		this.stockNumber=utility.inputInteger();
	}
	public Stock(){
	}

	public String getStockName(){
		return stockName;
	}

	public int getStockPrice(){
		return stockPrice;
	}

	public int getStockNumber(){
		return stockNumber;
	}

	public void setStockName(String stockName){
		this.stockName=stockName;
	}

	public void setStockPrice(int stockPrice){
		this.stockPrice=stockPrice;
	}

	public void setStockNumber(int stockNumber){
		this.stockNumber=stockNumber;
	}

	public String toString(){
		return stockName+" "+stockPrice+" "+stockNumber+"  "+(stockPrice*stockNumber)+" "+"\n";

	}
}
