package com.cgi.shapes;
//class, data types, autoboxing
//constructor -default
//String immutability
//equals
//oops - polymorphism, inheritance, abstraction,
//overriding -same function name but different working
//interfaces
//Collection - Lists, Sets, Map
//before using objects in collections override equals, hashcode, and implements

import java.io.Serializable;
import java.util.Objects;

import com.cgi.day3.Animationable;


//public class Circle extends Shape implements Comparable<Circle>, Serializable, Animationable{
public class Circle extends Shape implements Comparable<Circle>, Serializable{
	
	char c = 'a';
	int r=10; //literal data type
//	Integer val = r; //auto boxing
	String color = "White";
	
	
	
	public Circle(){
		r=c;
		
	}
	public Circle(int r){
		this.r = r;
	}
	public Circle(int r, String col){
		this.r=r;
		this.color = col;
	}
	public void process(){
		color="black";
		// color = color.concat(" is good");
		String color2 = "black";
		String color3 = new String("black");
		String color4 = new String("black");
		System.out.println(color == color2);// compare by reference
		System.out.println(color == color3);
		System.out.println(color.equals(color3)); //by value inside value
		
	}
	
	public void process(String p) {
		System.out.println("process is "+"p");
	}
	
	public static void main(String[] args) {
		Circle c3 = new Circle(2);//static polymorphism
		Circle c = new Circle(2, "red");
		Circle c2 = new Circle(2, "red");
//		System.out.println(c==c2);
		System.out.println(c.hashCode()==c2.hashCode());
		System.out.println(c.equals(c2));
		System.out.println(c);
		
//		System.out.println("In master cicle b3 " + c.i);
		c.process();
		Shape s = new Shape();
		System.out.println(s.getName());
//		s=c;//dynamic polymorphism
//		c.process("hello");
//		 System.out.println(c.color);
		System.out.println(s.getName());
		
//		System.out.println(c.getName());
//		Comparable c4 = c;//object is comparable
		
//		Comparable c4 = c;
//		

//		Animationable anm = new Circle(3);
//		anm.drawable(null);
//		
//		
//		int d = Animationable.r;
		
//		anm.drawable("time");
		
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(color, r);
	}
	
	public String getName() {
		return "child Circle " + r;
	}
	
	
	@Override
	public String toString() {
		return "radius is " + r + ", color is " + color ;
	}
	@Override public int compareTo(Circle o) {
		return this.r-o.r;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		return Objects.equals(color, other.color) && r == other.r;
	}
	
	
	
	
}
