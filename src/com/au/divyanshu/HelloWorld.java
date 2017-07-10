package com.au.divyanshu;

public class HelloWorld {
	
	public static final String FIRST_NAME = "Divyanshu";

	public static final String LAST_NAME = "Kumar";
	
	public static String getFirstName(){
		return FIRST_NAME;
	}
	
	public static String getLastName(){
		return LAST_NAME;
	}
	
	public static void main(String... args) {
		System.out.println(getFirstName() + "  " + getLastName());
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

	}
	
	
}
