package com.cgi.day3Task;

import java.util.HashMap;
import java.util.Map;


public class PersonsMarks {
	private Map<Person, Integer> mp = new HashMap<>();
	
	public Double classPerformance() {
		Person p1 = new Person("Ram");
		Person p2 = new Person("Shyam");
		Person p3 = new Person("Mohan");
		
		mp.put(p1, 80);
		mp.put(p2, 76);
		mp.put(p3, 90);
		
		int a1 = mp.get(p1);
		int a2 = mp.get(p2);
		int a3 = mp.get(p3);
		
		double total = a1 + a2 + a3;
		double avg = total/3;
		return avg;
		
}
	public static void main(String[] args) {
		PersonsMarks pm = new PersonsMarks();
		System.out.println("Average of marks of all three Persons " + pm.classPerformance());
	}

}
