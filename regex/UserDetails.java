package com.bridgelabz.model;
public class UserDetails{
	private String fName;
	private String lName;
	private String mobileNo;
	private String date;

	public UserDetails(){
	}

	public void setfName(String fName){
		this.fName=fName;
	}

	public void setlName(String lName){
		this.lName=lName;
	}

	public void setmobileNo(String mobileNo){
		this.mobileNo=mobileNo;
	}

	public void setdate(String date){
		this.date=date;
	}

	public String getfName(){
		return fName;
	}

	public String getlName(){
		return lName;
	}

	public String mobileNo(){
		return mobileNo;
	}

	public String date(){
		return date;
	}
}
