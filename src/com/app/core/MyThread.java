package com.app.core;

public class MyThread extends Thread{

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());// main
		Thread.currentThread().setName("safu junior");
		System.out.println(Thread.currentThread().getName());// safu junior
		      
		
		MyThread d=new MyThread();
		
		System.out.println(d.currentThread().getName());// safu junior
		d.setPriority(9);
		System.out.println(d.getPriority());//9
		System.out.println(d.MAX_PRIORITY);//10
		System.out.println(d.MIN_PRIORITY);//1
		System.out.println(d.NORM_PRIORITY); //5
		System.out.println(Thread.MAX_PRIORITY);
	}

}
