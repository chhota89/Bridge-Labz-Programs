package com.bridgelabz.model;

/*

* created by: Bridge Labz
* Date 09/05/2016
*
* Perpose: model class for Node

**/

public class Node{

	private String data;
	public Node right;
	public Node left;

	public Node(String data){
		this.data=data;
		right=null;
		left=null;
	}

	public Node(){}

	public void setData(String data){
		this.data=data;
	}

	public String getData(){
		return data;
	}

}
