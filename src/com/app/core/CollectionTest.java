package com.app.core;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.RandomAccess;

public class CollectionTest {

	public static void main(String[] args) {
	ArrayList<Object> m1=new ArrayList<Object>();
	System.out.println("arraylist");
	System.out.println(m1 instanceof Serializable);
	System.out.println(m1 instanceof Cloneable);
	System.out.println(m1 instanceof RandomAccess);
	
	LinkedHashMap m =new LinkedHashMap();
	System.out.println("HashLinked");
	System.out.println(m instanceof Serializable);
	System.out.println(m instanceof Cloneable);
	System.out.println(m instanceof RandomAccess);
	
	LinkedList m2=new LinkedList();
	System.out.println("linkedlist");
	System.out.println(m2 instanceof Serializable);
	System.out.println(m2 instanceof Cloneable);
	System.out.println(m2 instanceof RandomAccess);
	

	}

}
