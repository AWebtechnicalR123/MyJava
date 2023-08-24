package com.cgi.day4Tasks;

public class RevString {
	private String st = "Footballground";

	private String ss = "";
	public void ReverseString() {
		
		for(int i=st.length()-1;i>=0; --i) {

			ss = ss + st.charAt(i);
		}
		System.out.println(ss);
	}
	public static void main(String[] args) {
		
		RevString rs = new RevString();
		rs.ReverseString();
		
	}

}
