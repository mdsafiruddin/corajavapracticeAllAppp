package com.app.core;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
	
		Set s= new HashSet();
		s.add(new StringBuffer("raja"));
		s.add(new StringBuffer("rama"));
		s.add(new StringBuffer("rupa"));
		s.add(new StringBuffer("raka"));
		s.add(new StringBuffer("raja"));
		System.out.println(s.size());
		System.out.println(s);
		
		System.out.println("--------forloop_------");
		for(Object ob: s) {
			System.out.println(ob);
		}
		System.out.println("=================");
		@SuppressWarnings("rawtypes")
		Iterator i=s.iterator();
		while(i.hasNext()) {
		Object obj=	i.next();
		
		System.out.println(obj);
		}
		 
		
		
	}

}
