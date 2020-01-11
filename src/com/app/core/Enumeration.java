package com.app.core;

import java.util.Vector;
public class Enumeration {

	public static void main(String[] args) {
	/* Vector v= new Vector();
	for(int i=0; i<=10; i++) {
		v.addElement(i);
	}
	System.out.println(v);
	*/
		
		Vector v = new Vector();  
		for(int i=0; i<=10; i++) {  
			v.addElement(i);  
			}  
		System.out.println(v); 
    java.util.Enumeration e = v.elements();   
		while(e.hasMoreElements()) {  
			Integer I = (Integer)e.nextElement();   
			if(I%2 == 0)
			System.out.println(I);  
			}  
		System.out.println(v);


}
}