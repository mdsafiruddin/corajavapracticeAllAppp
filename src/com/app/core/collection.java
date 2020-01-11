package com.app.core;

import java.util.Iterator;
import java.util.TreeSet;

public class collection {

	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		
		t.add("abas");
		t.add("cat");
		
		t.add("note");
		t.add("boss");
		t.add("49");
		t.add("33");
		t.add(""); 
		t.add("roy");
		
	     System.out.println(t);
	     
	     t.forEach(System.out::println);
	     System.out.println("----------------");
	    Iterator i=t.iterator(); 
	   
	    while(i.hasNext()) {
	    	if(i.equals("boss"))
	 		   i.remove();
	    String s=	(String) i.next();
	    System.out.println(s);
	    }
	    
		 
	}

}
