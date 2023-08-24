package com.cgi.task2;

//import com.cgi.shapes.Circle;

public class Rectangle extends Shape{
	private int l=5;
	private int b= 4;
	
	public Rectangle(int l, int b){
		this.l = l;
		this.b = b;
	}
	public int area() {
		return l*b;
	}
	public static void main(String[] args) {
//		Rectangle rec = new Rectangle(5, 6);
//		System.out.println(rec.area()+ " "+ rec.getName()+ " "+ rec.getColor());
	}
	
	
	
	

}
