package com.cgi.day4Tasks;

public class Rectangle {
	String rn="";
	String rs="";
	public Rectangle(String rn, String rs) {
		this.rn = rn;
		this.rs = rs;
		
	}
	@Override
	public String toString() {
		return rn + " is " + rs;
	}
}
