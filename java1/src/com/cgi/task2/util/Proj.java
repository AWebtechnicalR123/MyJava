package com.cgi.task2.util;

import com.cgi.task2.Rectangle;
import com.cgi.task2.Circle;

public class Proj{
	
	public static void main(String[] args) {
//		Proj pr = new Proj();
//		System.out.println(pr.area()+ " "+ pr.getColor()+ " " +pr.getName());
		Rectangle r = new Rectangle(3, 4);
		Circle c = new Circle(3);
		System.out.println(r.area()+ " "+ r.getName());
		System.out.println(c.area()+ " "+ c.getColor());
		
	}

}
