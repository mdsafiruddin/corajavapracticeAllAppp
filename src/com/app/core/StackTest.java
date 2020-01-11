package com.app.core;

import java.util.Stack;
import java.util.Vector;

public class StackTest {


	public static void main(String[] args) {
		Stack<Object> s = new Stack<Object>();
		Vector v=new Vector();
		System.out.println(v.capacity());
		
		s.push("khube");
		s.push(null);
		s.push("null");
		s.push("khube");
		s.push(12121212);
		s.push(0);
		s.push(-12121212);
		
		System.out.println(s);
		
		for(Object obj:s)
			System.out.println(obj);
		
		s.forEach(System.out::println);
		System.out.println(s.capacity());
		System.out.println(s.pop());
		/*System.out.println(s.pop());
		System.out.println(s);
		
		System.out.println(s.peek());
		System.out.println(s.peek());
		System.out.println(s);
		System.out.println(s.search(null));
		System.out.println(s.search("null"));*/
	}

}
