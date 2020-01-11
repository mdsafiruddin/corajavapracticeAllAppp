package com.app.core;

import java.io.ObjectInputStream.GetField;

public class Test {
	
 /*public String show(){  
	 return "Test";
	 }  
 
 public String string() {
	 
	 return "today is bad day";
 }
 // public static void main(String[] args){ 
	/*  Integer i=new Integer(10);
	 String s=new String("ashok");  
	 Test t=new Test(); 
	 System.out.println(i);  
	 System.out.println(s);  
	 System.out.println("frist::"+t.hashCode());  
	 System.out.println(t.hashCode()); 
	 System.out.println(t.toString());  
	 System.out.println("to generate the hashcode:: "+t.toString().hashCode());
	 System.out.println("only foer toString:: "+t.toString().getClass().getName());
	 System.out.println("call the string from:: "+t);*/
	  
	  
	  int i; 
	  Test(int i) 
	  { 
		  this.i=i; 
		  } 
	  public int hashCode(){ 
		
		  return i; 
		  } 
	  public String toString()
	  {
		  return i+""; 
}
	  public static void main(String[] args) {
		  Test t1=new Test(10); 
		  Test t2=new Test(100);
		  System.out.println(t1); 
		  System.out.println(t2);
		  System.out.println(t1.toString().getClass().getName()); 
		  System.out.println(t2.hashCode());
		  System.out.println(t1.toString()); 
		  System.out.println(t2.hashCode()+t2.getClass().getName());
		 try {
			System.out.println(t2=(Test)t1.clone());
		} catch (CloneNotSupportedException e) {
			System.out.println("clone not happende");
			e.printStackTrace();
		}
		 
		   
	  }
	  
}