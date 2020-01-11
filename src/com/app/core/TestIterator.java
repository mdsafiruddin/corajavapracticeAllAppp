package com.app.core;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		
		for(int i=0; i<=10; i++) {
			al.add(i);
		}
		System.out.println(al);
		System.out.println("--------------------");
		
		al.forEach(System.out::println);
	System.out.println("--------------------");
		
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
		Integer it	=(Integer) itr.next();
		if(it%2==0)
		System.out.println(it);
		}
		System.out.println(al);
	}


}
