package com.bridgelabz.stopwatch;


/*

* created by: Bridge Labz
* Date 3/05/2016
*
* Perpose: Stopwatch Program for measuring the time that elapses between the start and end clicks

**/

import com.bridgelabz.utility.Utility;

public class StopWatch{
	
	public static void main(String args[]){
		String finish=new String();
		Utility utility=new Utility();
		boolean started=true;
		StopWatch stopWatch=new StopWatch();
		long time=0;
		long lastStart=System.currentTimeMillis();
		do{

				if(started){
					System.out.println("press N to stop");
					finish=utility.inputWord();
					if(finish.equals("N")){
						time=System.currentTimeMillis()-lastStart;
						System.out.println("Time is:"+(time%1000)+" Second");
						started=false;
					}
				}
				else{
					System.out.println("press Y to start");
					finish=utility.inputWord();
					if(finish.equals("Y")){
						lastStart=System.currentTimeMillis();
						started=true;
					}
					
				}
				System.out.println("Press C to continue");
				finish=utility.inputWord();
			
		}while(true);
	}
}
