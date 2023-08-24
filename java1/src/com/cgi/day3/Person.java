package com.cgi.day3;

import java.util.Objects;


public class Person {
	private String firstName;
	private String lastName;
	private Circle myc;
	
	
	public Person() {
		super();
	}
	
	public Person(String firstName, String lastName, Circle myc) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.myc = myc;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Circle getMyc() {
		return myc;
	}

	public void setMyc(Circle myc) {
		this.myc = myc;
	}
	
	public static void main(String[] args) {
		TestMap mp = new TestMap();
		mp.testMap();
	}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName);
	}
	
	
	
}
