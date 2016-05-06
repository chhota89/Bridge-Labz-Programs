package com.bridgelabz.utility;
import java.io.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import com.bridgelabz.model.Stock;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.bridgelabz.model.UserDetails;
public class Utility{
	BufferedReader bufferedReader,br;
	private final String REGEX_NAME = "<<name>>";
	private final String REGEX_FULLNAME = "<<full name>> ";
	private final String REGEX_MOBILE_NO = "xxxxxxxxxx";
	private final String REGEX_DATE = "01/01/2016";
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

	//format date object in this format 01/12/2016 
	public String getFormatedDate(Date date){
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(date);
	}

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
}
