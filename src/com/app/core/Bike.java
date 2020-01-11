package com.app.core;

public class Bike {

	public Bike(double d) {
		System.out.println("from double method");
	}
	

	public Bike(int a) {
	System.out.println("from the int method");
	}
	
	public Bike(String s) {
		this(10);
		
		System.out.println("from the  string ");
	}
	
	public Bike() {
		this(44.5);
		System.out.println("from the default");
	}
	
	public static void main(String[] args) {
		Bike b=new Bike("hello");
		Bike b2=new Bike();
		Bike b1=new Bike(19);
		
		// it is called as constructor chaining  and constructor overloading
	}

}
