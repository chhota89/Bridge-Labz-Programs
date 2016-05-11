package com.bridgelabz.utility;
/*

* created by: Bridge Labz
* Date 4/05/2016
*
* Perpose: Putting Commonly used function in single file.
	1 function to take word,integer and double as input
	2: function to read file.
	3 function to match regex from string and replace with user details	 

**/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import com.bridgelabz.model.Stock;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.bridgelabz.model.UserDetails;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class Utility{

	BufferedReader bufferedReader,br;
	private final String REGEX_NAME = "<<name>>";
	private final String REGEX_FULLNAME = "<<full name>> ";
	private final String REGEX_MOBILE_NO = "xxxxxxxxxx";
	private final String REGEX_DATE = "01/01/2016";
	
	//constructor to initalize bufferedReader
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

	//Take Double Input
	public double inputDouble(){
		 
			try{
				try{	
					return Double.parseDouble(bufferedReader.readLine());
				}
				catch(NumberFormatException exception){
					System.out.println(exception.getMessage());	
				}
			}catch(IOException exception){
				System.out.println(exception.getMessage());
			}
		return 0.0;
	}

	//Take number of random number to genrate as input and return array of random number
	public int[] getRandomArray(int number){
		Random randomGenerator = new Random();
		int array[]=new int[number];
		for(int i=0;i<number;i++){
			array[i]=randomGenerator.nextInt();
		}
		return array;
	}

	//Read the file  and take stock detils as input and return arraylist of stock details
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

	//format date object in this format 01/12/2016 
	public String getFormatedDate(Date date){
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(date);
	}

	//Regex pattern matcher match the string and replace the regex pattern with user details.
	public String convertString(UserDetails userDetails,String message){
		Pattern p = Pattern.compile(REGEX_NAME);
       		Matcher m = p.matcher(message); 
       		message = m.replaceAll(userDetails.getfName());

		p = Pattern.compile(REGEX_FULLNAME);
		m = p.matcher(message); 
		message = m.replaceAll(userDetails.getfName()+" "+userDetails.getlName());

		p = Pattern.compile(REGEX_MOBILE_NO);
		m = p.matcher(message); 
		message = m.replaceAll(userDetails.mobileNo());

		p = Pattern.compile(REGEX_DATE);
		m = p.matcher(message); 
		message = m.replaceAll(userDetails.date());

		return message;
	}

	//Take file name as input and return string of file text
	public String getFileText(String fileName){

		try{

			br=new BufferedReader(new FileReader(fileName));
			StringBuilder sb=new StringBuilder();
			String line=br.readLine();
			while(line!=null){
				sb.append(line);
				sb.append(System.lineSeparator());
				line=br.readLine();
			}
			return sb.toString();
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

	public void printMap(Map mp) {
    		Iterator it = mp.entrySet().iterator();
    		while (it.hasNext()) {
        		Map.Entry pair = (Map.Entry)it.next();
        		System.out.println(pair.getKey() + " = " + pair.getValue());
        		it.remove(); // avoids a ConcurrentModificationException
    		}
	}
}
