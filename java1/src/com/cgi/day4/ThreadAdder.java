package com.cgi.day4;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadAdder extends Thread{
	
//	int x = 0;
	AtomicInteger x = new AtomicInteger(0); //race situation is reading of a varaiblae in intermediate state
	//toavoid this use Atomic or 
	
	@Override
	public void run() {
		for(int i=0; i<10000; ++i){
//			System.out.println(currentThread()+ " "+x++);
			System.out.println(currentThread()+ " "+x.incrementAndGet());
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		
			
		}
		
	}
	public static void main(String[] args) {
		ThreadAdder ta1 = new ThreadAdder();
		ThreadAdder ta2 = new ThreadAdder();
		ThreadAdder ta3 = new ThreadAdder();
		
		ta1.start();
		ta2.start();
		ta3.start();
		

	}

}
