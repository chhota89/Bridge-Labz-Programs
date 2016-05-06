package com.bridgelabz.practice;

/*

* created by: Bridge Labz
* Date 06/05/2016
*
* Perpose: Providing functionality of string to associative array.
**/
import java.util.StringTokenizer;
import com.bridgelabz.utility.Utility;
import java.util.HashMap;
import java.util.Map;
public class StingToArray{

	
	public static void main(String args[]){
		String stringArray="A:10,B:20,C:20";
		convertStringToIntArray(stringArray);
		HashMap<String,Integer> map=convertStringToIntArray(stringArray);
		//System.out.println(map.size());
		new Utility().printMap(map);
	}

	public static HashMap<String,Integer> convertStringToIntArray(String stringArray){
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		StringTokenizer tok=new StringTokenizer(stringArray,",");
		StringTokenizer tokForComma;
		int i=0,position=0;String name="";
		while(tok.hasMoreTokens()){
			try{
				String temp=tok.nextToken();
				position=temp.indexOf(':');
				map.put(temp.substring(0,position),Integer.parseInt(temp.substring(position+1,temp.length())));
			}
			catch(Exception e){
			}
		}
		return map;

	}

}
