package com.app.core;

import java.util.Vector;

public class VectorTest {
	public static void main(String[] args) {
		Vector< Object> v=new Vector<Object>();
		v.addElement("kisan");
		v.addElement("kasar");
		v.addElement("kasam");
		v.addElement("karan");
		v.addElement(5555);
		v.addElement(777);
		//v.addAll(v);
		System.out.println(v);
		//v.remove(6);// exception out of range
		System.out.println(v);
		v.setElementAt("hero", 1);
		System.out.println(v);
		v.removeElementAt(1);
		System.out.println(v);
		
	}

}
