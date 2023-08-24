package com.cgi.day4Tasks;

public class SumAscii {
	private String ss = "Teacher";
	private int sum = 0;
	
	public void calcAscii() {
		for(int i=0;i<ss.length(); i++) {
			sum += ss.charAt(i);
		}
		System.out.println(sum);
	}
	
public static void main(String[] args) {
		
		SumAscii sai = new SumAscii();
		sai.calcAscii();
		

	}
}
