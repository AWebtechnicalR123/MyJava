package com.cgi.day3;

import java.io.IOException;
import java.text.ParseException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.zip.DataFormatException;

public class TryExceptions {
	
//	public Person calcTopper(Map<Person, Integer> map) throws Exception{
	public Person calcTopper(Map<Person, Integer> map) throws IOException, ParseException, NegativeNumberException{
		
		
		
		Set<Entry<Person, Integer>> eset = map.entrySet();
		Iterator<Entry<Person, Integer>> it = eset.iterator();
		
		int temp=0;
		Person topper = null;
		while(it.hasNext()) {
			Entry<Person, Integer> en = it.next();
//			if(en.getValue()<0) throw new Exception("Number is negative");
//			if(en.getValue()<0) throw new DataFormatException("Number is negative");
//			if(en.getValue()<0) throw new IOException("Number is negative");
			if(en.getValue()<0) throw new NegativeNumberException("Number is negative", -2);
			
//			if(en.getValue()>100) throw new NumberFormatException("Invalid High Value"); //Runtime exception
			if(en.getValue()>100) throw new ParseException("Invalid High Value", 4);
			
//			if(en.getKey().getFirstName() == null) throw new RuntimeException("Invalid data");
			if(en.getKey().getFirstName() == null) throw new NumberFormatException("Invalid data");
			
			
			if (en.getValue() > temp ) {
				temp = en.getValue();
				topper = en.getKey();
			}
		
			
		}
		
		return topper;
	}
}
