package com.app.core;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TestStr {

	public static void main(String[] args) {
        List<String> l=new ArrayList<String>();
        l.add("rama");
        l.add("kube");
        l.add("hunt");
        l.add("morning");
        l.add("morning");
        System.out.println(l);
        
        l.forEach(System.out::println);
        
        for(String s:l) {
        	System.out.println(s);
        }
        System.out.println("====using Set=====");
     Set<String> s=new HashSet<String>();
     s.addAll(l);
     System.out.println(s); 
     
     System.out.println("==== without using Set=====");
     List<String> al=l.stream().distinct().collect(Collectors.toList());
     al.forEach(System.out::println);
     
	}



}
