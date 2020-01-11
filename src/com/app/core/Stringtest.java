package com.app.core;

public class Stringtest implements Cloneable {

	int a=10;
	int b=20;
	public static void main(String[] args) throws CloneNotSupportedException{

		Stringtest t=new Stringtest();
		
			Stringtest t2=(Stringtest)t.clone();
			//t2.a=88;
			//t2.b=99;
			System.out.println(t2.a);
			System.out.println(t2.b);
		
            System.out.println(t.a==t.b);

	}
 // clone method is not working
}
