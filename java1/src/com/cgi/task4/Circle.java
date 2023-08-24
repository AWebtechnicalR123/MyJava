package com.cgi.task4;

//import java.io.Serializable;
import java.util.Objects;




//public class Circle extends Shap implements Comparable<Circle>, Serializable{
public class Circle implements Comparable<Circle>{
	int r=19;
	public Circle(int r) {
		this.r = r;
	}
	
	@Override
	public String toString() {
		return "radius is " + r;
	}
	 
	
	@Override public int compareTo(Circle o) {
		return this.r-o.r;
	}
	
	
	
}
