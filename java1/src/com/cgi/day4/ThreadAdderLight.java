package com.cgi.day4;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadAdderLight implements Runnable{
	private AtomicInteger x = new AtomicInteger(0); //race situation is reading of a varaiblae in intermediate state
	//toavoid this use Atomic or  Synchroinsed keaword
	
	@Override
	public void run() {
		for(int i=0; i<1000; ++i){
			System.out.println(Thread.currentThread()+ " "+x.incrementAndGet());
			
//			try {
//				Thread.sleep(1000);
//			} catch(InterruptedException e) {
//				e.printStackTrace();
//			}
		
			
		}
		
	}
	
	public static void main(String[] args) {
		ThreadAdderLight t1 = new ThreadAdderLight();
		Thread th0 = new Thread(t1);
		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t1);
		
		th0.start();
		th1.start();
		th2.start();
		
	}

}
