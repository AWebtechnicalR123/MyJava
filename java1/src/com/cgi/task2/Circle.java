package com.cgi.task2;

public class Circle extends Shape{
	private int r=10;
	
	public Circle(int r){
		this.r = r;
	}
	
	public double area() {
		return 3.14*r*r;
	}
	public static void main(String[] args) {
//		Circle cr = new Circle(4);
//		System.out.println(cr.area()+ " "+ cr.getName()+ " "+ cr.getColor());
		
	}
}
