package com.cgi.day3;

public class NegativeNumberException extends Exception{
	
	public NegativeNumberException(String message, Integer x){
//		String s = message + " " + x;
		super(message+ " "+x);
	}
}
