package com.cgi.task4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class CircleObj {
	public void CircleObject() {
		ArrayList<Circle> ac = new ArrayList<>();
		
			
		Circle c1 = new Circle(1);
		Circle c2 = new Circle(8);
		Circle c3 = new Circle(3);
		Circle c4 = new Circle(6);
		
		ac.add(c1);
		ac.add(c2);
		ac.add(c3);
		ac.add(c4);
		ac.add(c4);
		
		Set<Circle> ci= new HashSet<Circle>(ac);
		
//		ci.add(c4);
		
		for(int i=0;i<ac.size();++i) {
			System.out.println(ac.get(i));
		}
		
		System.out.println("\n"+"After removing Dublicates");
		Iterator it = ci.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
//		System.out.println();
		
//		Set<Circle> cii= new TreeSet<Circle>(ac);
//		For(Circle crr : cii){
//			System.out.println(crr);
//		}
		
	}
	public static void main(String[] args) {
		CircleObj ob = new CircleObj();
		ob.CircleObject();

	}

}
