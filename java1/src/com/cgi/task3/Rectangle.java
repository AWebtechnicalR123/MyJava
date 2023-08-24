package com.cgi.task3;

import java.util.Arrays;

import com.cgi.shapes.Circle;
//import com.cgi.shapes.Shap;
import com.cgi.shapes.Shape;

public class Rectangle implements Comparable<Rectangle>{
	private int l=5;
	private int b=6;
	Rectangle(int l, int b){
		this.l = l;
		this.b= b;
		
	}
	
	public int area() {
		return l*b;
	}
	public static void main(String[] arr) {
		int lent = 3;
		int wid = 4;
		Rectangle[] rArr = new Rectangle[5];
		for(int i=rArr.length-1; i>=0;i--) {
			rArr[i]=new Rectangle(lent++, wid++);
			
		}
		
		Arrays.sort(rArr);
		for(int i=0;i<5;i++) {
			System.out.println(rArr[i].area());
		}
	}
	@Override
	public int compareTo(Rectangle o) {
		return this.area() - o.area();
	}
	
	
}
