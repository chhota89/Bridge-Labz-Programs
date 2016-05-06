package com.bridgelabz.utility;
import java.io.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import com.bridgelabz.model.Stock;
import java.util.ArrayList;
public class Utility{
	BufferedReader bufferedReader,br;
	public Utility(){
		bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	}

	//take input word
	public String inputWord(){
		try{
			return bufferedReader.readLine();
		}
		catch(IOException exception){
			System.out.println(exception.getMessage());
		}
		return "";
	}

	//Take Integer Input
	public int inputInteger(){
		 
			try{
				try{	
					return Integer.parseInt(bufferedReader.readLine());
				}
				catch(NumberFormatException exception){
					System.out.println(exception.getMessage());	
				}
			}catch(IOException exception){
				System.out.println(exception.getMessage());
			}
		return 0;
	}

	public ArrayList<Stock> getStockDetails(String fileName){
		ArrayList<Stock> stockList=new ArrayList<Stock>();
		try{
			br=new BufferedReader(new FileReader(fileName));
			StringBuilder sb=new StringBuilder();
			String line=br.readLine();
			while(line!=null){
				System.out.println();
				System.out.println(line);
				stockList.add(new Stock(line));
				line=br.readLine();
			}
			return stockList;
		 }
		catch(Exception exception){
			return null;
		}
		finally{
			try{
				br.close();
			}
			catch(IOException exception){
			}	
		}
	}

	//Function take String in dd/MM/yyyy format and return Date Object
	public Date stringToDate(String date){
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try{
			return sdf.parse(date);
		}
		catch(ParseException parseException){
			return null;
		}
	}
}
