package com.cgi.day3;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


//map is a key vaue pair, both key values are objects.
public class TestMap {
//	private int x=20;
//	Map m = new HashMap();
	Map<Person,Circle> m = new HashMap<Person, Circle>();
//	Map<Person,Circle> m = new TreeMap<Person, Circle>(); //will give sorted order
	Map<String,List<Character>> m2 = new HashMap<>();
//	x=0;
//	x=x+1 //we can't do it without method
	public void testMap() {
		Person p1 = new Person("Ram", "Arora", null);
//		m.put("Ram", p1);
//		m.put("India", "Delhi");
//		m.put(1,"One");
		m.put(p1, new Circle(2));
		m.put(new Person("P1", "L1", null), new Circle(3));
		m.put(new Person("P2", "L2", null), new Circle(4));
		
//		Object s = m.get(p1);
//		Circle c = (Circle)s; //casting
//		c.process();
		Circle c = m.get(p1);
		c.process();
		
		List<Character> l = new ArrayList<>();
		l.add('A');
		l.add('p');
		l.add('p');
		l.add('l');
		l.add('e');
				
		m2.put("Apple", l);
		List<Character> val = m2.get("Apple");
//		List val = m2.get("Apple");
//		Character tmp = val.get(0);
		System.out.println(val);
		
		//Gives al keys
		Set s = m.keySet(); //All the keys
		System.out.println(s);
		
		System.out.println();
		
		Collection cl = m.values(); //all the values
		System.out.println(cl);
		
		Set<Entry<Person, Circle>> en = m.entrySet(); //entry set for key from values
		List<Entry<Person, Circle>> cl2 = new ArrayList<>(en);
		System.out.println(cl2.get(0));
		Entry<Person, Circle> ent = cl2.get(0);
		System.out.println(ent.getKey());
		System.out.println(ent.getValue());
		
//		Person p =ent.getKey();
//		Circle c3 = ent.getValue();
//		System.out.println(p);
//		System.out.println(c3);
	}
	

	public static void main(String[] args) {
		TestMap mp = new TestMap();
		mp.testMap();

	}

}
