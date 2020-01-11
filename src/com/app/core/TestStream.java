package com.app.core;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class TestStream {

	public static void main(String[] args) {

		List<Object> al= new ArrayList<Object>();
		
	/*	al.add("karan");
		al.add("kasam");
		al.add("karan");
		al.add("kamal");
		al.add("kasim");*/
		
		Stream<Object> s=al.stream();
		//s.forEach(System.out::println);
		
		
		Stream<Object> s1=Stream.of(al);
		//s1.forEach(System.out::println);
		

		Stream<Object> s2=Stream.of(new String[]{"rama","raja","raja"});
		//s2.forEach(System.out::println);
		


        Stream<Date> stream = Stream.generate( ()->{return new Date();});
       // stream.forEach(p -> System.out.println(p));
   

	for(int i=0;i<=10; i++) {
		al.add(i);
	}
	  Stream<Object> list= al.stream();
	  
	  Object[] lt=list.toArray(Object[]::new);
	 for(Object b:lt) {
		 System.out.println(b);
	 }
	  
	}
}

