package com.app.core;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateTest {

	public static void main(String[] args) {
		ArrayList<Employee> al=new ArrayList<Employee>();
		 al.add(new Employee(11,"rama","java"));
		 al.add(new Employee(12,"raja","spring"));
		 al.add(new Employee(11,"rama","java"));
		 
		//System.out.println(al);

		 //List<Employee> list = al.stream().distinct().collect(Collectors.toList());
		 //System.out.println(list);
		 
		    Set<Employee> set = new HashSet<Employee>();
			set.addAll(al);
			al = new ArrayList<Employee>();
			//al.clear();
			al.addAll(set);
			al.forEach(System.out::println);
	}

}
