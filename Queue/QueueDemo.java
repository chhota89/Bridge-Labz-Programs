package com.bridgelabz.queuedemo;

/*

* created by: Bridge Labz
* Date 5/05/2016
*
* Perpose: Create a Program which creates Banking Cash Counter where people come in to deposit Cash and withdraw Cash. Have an input panel to * * add people to Queue to either deposit or withdraw money and dequeue the people. Maintain the Cash Balance. 	 

**/
import com.bridgelabz.utility.Utility;
import com.bridgelabz.model.Queue;

public class QueueDemo{
	Utility mUtility;
	Queue<Integer> withdrawQueue;
	Queue<Integer> depositeQueue;
	public QueueDemo(){
		mUtility=new Utility();
		withdrawQueue=new Queue<Integer>();
		depositeQueue=new Queue<Integer>();
	}
	public static void main(String args[]){
		QueueDemo queueDemo=new QueueDemo();
		String exit=new String();
		do{
			System.out.println("1: Deposite Cash");
			System.out.println("2: Withdraw Cash");
			System.out.println("3: Withdraw Queue size");
			System.out.println("4: Deposite Queue size");
			queueDemo.menuChoice(queueDemo.mUtility.inputInteger());
			System.out.println("Press E to exit");
			exit=queueDemo.mUtility.inputWord();		
		}while(!exit.equalsIgnoreCase("E"));
	}

	public void menuChoice(int choice){
		switch(choice){
			case 1: Deposite();
					break;
			case 2: Withdraw();
					break;
			case 3: System.out.println("withdraw Queue size is: "+withdrawQueue.size());
					break;
			case 4: System.out.println("withdraw Queue size is: "+depositeQueue.size());
					break;
		}
	}

	public void Deposite(){
		System.out.println();
		System.out.println("1: Join In queue.");
		System.out.println("2: Get service (Leave Queue).");
		int n=mUtility.inputInteger();
		switch(n){
			case 1: try{
						depositeQueue.enQueue(new Integer(1));
					}catch(Exception exception){
						System.out.println("Queue is Full.");
					}
					break;
			case 2: try{
						depositeQueue.deQueue();
					}catch(Exception exception){
						System.out.println("Queue is Empty.");
					}
					break;
		}
	}

	public void Withdraw(){
		System.out.println();
		System.out.println("1: Join In queue.");
		System.out.println("2: Get service (Leave Queue).");
		int n=mUtility.inputInteger();
		switch(n){
			case 1: try{
						withdrawQueue.enQueue(new Integer(1));
					}catch(Exception exception){
						System.out.println("Queue is Full.");
					}
					break;
			case 2: try{
						withdrawQueue.deQueue();
					}catch(Exception exception){
						System.out.println("Queue is Empty.");
					}
					break;
		}
	}
}
