package com.cgi.day4Tasks;

//class, data types, autoboxing
//constructor -default
//String immutability
//equals
//oops - polymorphism, inheritance, abstraction,
//overriding -same function name but different working
//interfaces
//Collection - Lists, Sets, Map
//before using objects in collections override equals, hashcode, and implements


import java.util.Objects;

public class Circle{
	
	private String cn = "";
	private String cs = "";
//	public Circle(String ns) {
//		this.ns = ns;
//	}
	public Circle(String cn, String cs) {
		this.cn = cn;
		this.cs = cs;
		
	}
	
	@Override
	public String toString() {
		return cn + " is  " + cs;
	}
	
	
	
	
}
