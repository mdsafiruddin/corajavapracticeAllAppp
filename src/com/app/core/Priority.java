package com.app.core;

import java.util.PriorityQueue;

public class Priority {

	public static void main(String[] args) {
		
		PriorityQueue p=new PriorityQueue();
		p.offer("66");
		p.offer("");
		p.offer("");
		p.offer("89");
		p.offer("88");
		p.offer("87");
		p.offer("85");
		p.offer("82");
		System.out.println("before poll "+p);
		//System.out.println(p.peek());
		System.out.println(p.add("hero"));
		System.out.println(p.poll());
		System.out.println(p.poll());// delete the elemet from queue
		//System.out.println(p.peek());
		//System.out.println(p.peek());
		System.out.println("After pool "+p);

	}

}
