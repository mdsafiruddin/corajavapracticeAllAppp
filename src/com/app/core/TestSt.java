package com.app.core;
public class TestSt {

	public static void main(String[] args) {
		/*String s="hello";
		   s.concat("weolcome");
		   System.out.println(s);
		
		StringBuffer b=new StringBuffer(s);
		System.out.println(b.capacity());
		b.append("good");
		System.out.println(b);
		*/
		
		 System.out.println("This statement will be executed"); 
	 
	        String s = null;
	 
	        try
	        {
	        	//System.out.println(s.length());
	            System.out.println(10/0);
	        }
	        catch (Exception e) {
	        	e.printStackTrace();
			   System.out.println(e.getMessage());
			   System.out.println(e.toString());
	        }	
	       finally {
	    	   System.out.println("always execute");
	       }
	}
}