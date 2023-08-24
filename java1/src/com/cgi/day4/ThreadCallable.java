package com.cgi.day4;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

//This is parallel excution code to print 
public class ThreadCallable implements Callable<Integer>{
	private AtomicInteger x = new AtomicInteger(0);
	
//	This methods count parallel manner
	
	@Override
	public Integer call() throws Exception {
		
		for(int i=0; i<1000; ++i){
			System.out.println(Thread.currentThread()+ " "+x.incrementAndGet());
			
//			try {
//				Thread.sleep(1000);
//			} catch(InterruptedException e) {
//				e.printStackTrace();
//			}
		
			
		}
		return x.intValue();
	}
	public static void main(String[] args) {
		ThreadAdderLight t1 = new ThreadAdderLight();
		ThreadCallable tc = new ThreadCallable();
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getName());
		
		ExecutorService es = Executors.newFixedThreadPool(10);
		es.execute(t1);
		
		//third way of executing threads
		Future<Integer> fr1 = es.submit(tc);
		Future<Integer> fr2 = es.submit(tc);
		
		try {
			System.out.println(fr1.get());
			System.out.println(fr2.get());
		} catch (InterruptedException e) {
				System.out.println(e);
		} catch(ExecutionException e) {
			e.printStackTrace();
		}
//		fr1.get();
//		fr2.get();
	}
}
