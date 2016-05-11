package com.bridgelabz.model;

/*

* created by: Bridge Labz
* Date 09/05/2016
*
* Perpose: model class for Node

**/

public class Node<E>{

	private E data;
	public Node right;
	public Node left;

	public Node(E data){
		this.data=data;
		right=null;
		left=null;
	}

	public Node(){}

	public void setData(E data){
		this.data=data;
	}

	public E getData(){
		return data;
	}

}
