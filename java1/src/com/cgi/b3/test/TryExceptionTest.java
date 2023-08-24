package com.cgi.b3.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import com.cgi.day3.NegativeNumberException;
import com.cgi.day3.Person;
import com.cgi.day3.TryExceptions;


class TryExceptionTest {

	@Test
	void testCalcTopper() {
		TryExceptions te = new TryExceptions();
		Map<Person, Integer> mp = new HashMap<>();
		mp.put(new Person("P1", "L1", null), 1);
		mp.put(new Person("P2", "L2", null), 3);
		mp.put(new Person("P3", "L3", null), 2);
//		mp.put(new Person("p2", "L2", null), 2);
		
		Person p=null;
		try {
			p = te.calcTopper(mp);
		} 
		catch(NumberFormatException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
//			System.out.println(e.getMessage());
//			mp.remove(e);
//			System.out.println(e.getMessage());
			
		} 
//		catch(Exception e) {
		catch(ParseException e) {
			e.printStackTrace();
		} catch (NegativeNumberException e) {
			e.printStackTrace();
		}
		finally {
			//close open files or DB connection
			System.out.println("In finallly");
		}
		System.out.println("After catching and handling exception");
		assertEquals(new Person("P2", "L2", null), p); //testing which is topper
	}

}
