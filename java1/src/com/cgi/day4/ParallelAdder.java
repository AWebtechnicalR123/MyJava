package com.cgi.day4;

public class ParallelAdder {
	
	public int sumList(int[] x) {
		int sum = 0;
		for(int i : x) {
			sum += i;
		}
		
		return sum;	
	}
	
	public static void main(String[] args) {
		int[] y = {1,2,3,4,5};
		ParallelAdder pa  = new ParallelAdder();
		int tot = pa.sumList(y);
		System.out.println(tot);
 
	}

}
