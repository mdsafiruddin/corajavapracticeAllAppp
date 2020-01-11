package com.app.core;

public class Checking {
	
	public Checking() {
		this(77);
		System.out.println("default constructor");
	}
	
	public Checking(int a) {
		
		System.out.println("one constructor");
	}

	
	public Checking(int b,int c) {
		this();
		System.out.println("two constructor");
	}
	public static void main(String[] args) {
		Checking c=new Checking(11,22);
		

	}

}
