package com.cgi.day3;


public interface Animationable {
	public static final int r=10; //constatns
	int x=20;
	
//	default String drawable(String medium) {
	default String drawable(String medium) {
//		x=30;
		return null;
	}
	void animate(int x, int y);
}
