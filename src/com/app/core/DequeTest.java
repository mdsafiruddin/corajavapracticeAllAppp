package com.app.core;

import java.util.ArrayDeque;

public class DequeTest {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayDeque d= new ArrayDeque();
		d.add("667");
		d.add("668");
		d.add("666");
		d.add("664");
		d.add("663");
		d.add("663");
		d.add("661");
		System.out.println(d.add("889"));
		System.out.println("insert the element to the deeque "+d);
		System.out.println(d.getFirst());
		System.out.println("remove the object" +d.remove());
		System.out.println("last elemet deleted"+ d.getLast());
	}

}
