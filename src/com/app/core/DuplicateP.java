package com.app.core;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateP {
	
	public static void main(String[] args) {
		List<Customer> al=new ArrayList<Customer>();
		al.add(new Customer(11,"rana","kolkata"));
		al.add(new Customer(12,"rahul","hyd"));
		al.add(new Customer(11,"rana","kolkata"));
		
		System.out.println(al);
		System.out.println("========set=======");
		Set<Customer> set=new HashSet<Customer>();
		set.addAll(al);
		
		al=new ArrayList<Customer>();
		al.addAll(set);
		al.forEach(System.out::println);
		
		System.out.println("======stream=======");
		List<Customer> list = al.stream().distinct().collect(Collectors.toList());
		 list.forEach(System.out::println);
		
	}

}
