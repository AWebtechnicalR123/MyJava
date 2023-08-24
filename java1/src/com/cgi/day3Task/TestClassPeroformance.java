package com.cgi.day3Task;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestClassPeroformance {
	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before test");
	}

	@AfterAll
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After test");
	}


	@Test
	void testClassPerformance() {
		PersonsMarks obj = new PersonsMarks();
		double cp = obj.classPerformance();
		System.out.println(cp);
		assertEquals(82,cp);
		
	}

}
