package com.cgi.day4Tasks;

import java.util.ArrayList;
import java.util.List;

public class ListShapes {
	
	private ArrayList<Circle> spc=new ArrayList<>();
	private ArrayList<Rectangle> spr = new ArrayList<>();
	
	public void storeShapes() {
		spc.add(new Circle("c1", "red"));
		spc.add(new Circle("c2", "black"));
		
		spr.add(new Rectangle("r1", "red"));
		spr.add(new Rectangle("r2", "black"));
		for(int i=0; i<=spc.size()-1; ++i) {
			System.out.println("Circle "+spc.get(i) + " and Rectangle "+ spr.get(i));
		}
	}
	public static void main(String[] args) {
		ListShapes ls = new ListShapes();
		ls.storeShapes();

	}

}
