package com.app.core;

import java.util.Vector;

public class Linklist {

	public static void main(String[] args) {
		
		//LinkedList l = new LinkedList(); 
		/*
		 * l.add("Durga"); l.add(30); l.add("Venky"); l.add(null); l.add(3,"Durga");
		 * l.set(0,"Software");
		 * 
		 * 
		 * l.addFirst("CCC"); l.removeLast();
		 */
		/*
		 * Vector l=new Vector(); Vector l2=new Vector(); l.add("patna");
		 * l.add("radha"); l.add("papa"); l.add("pana"); l.add("payaa"); l.add("pool");
		 * l.add(0,"priya"); l.add("priya"); l.addElement("Love"); l.removeElementAt(4);
		 * //l.removeAllElements(); System.out.println(l);
		 * System.out.println(l.getClass().getName()); System.out.println(l.capacity());
		 * //[CCC, Venky, Software, 30, null]
		 */
		Vector v = new Vector();  
		System.out.println(v.capacity()); 
		//10
		for(int i = 1; i<=10; i++) {  
			v.addElement(i);
			} 
		
		System.out.println(v.capacity()); //10 
			v.addElement("A");  
			System.out.println(v.capacity()); //20 
			System.out.println(v);
		//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, A] 

	}

}
