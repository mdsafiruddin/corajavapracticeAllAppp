package com.app.core;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {

   List<Integer> l= Arrays.asList(1,1,4,5,6,8,8,9);
   
   Stream<Integer> sl = l.stream();
//   sl.forEach(System.out::println);
   sl.forEach(s -> System.out.print(s+" "));
   
   
  /* Stream<Integer> stream = l.stream();
   System.out.println(stream.collect(Collectors.toSet()));
   
   System.out.println(stream.distinct().collect(Collectors.toList()));*/
   
   /*
    Set<Integer> s=new HashSet<Integer>();	
    s.addAll(l);
    System.out.println(s);*/
   
   List<Integer> al=l.stream().distinct().collect(Collectors.toList());
  // System.out.println(al);
   //al.forEach(System.out::println);
	}
}