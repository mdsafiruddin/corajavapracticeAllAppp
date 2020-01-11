package com.app.core;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConHashMap {

	public static void main(String[] args) {
		ConcurrentHashMap<String, String> m=new ConcurrentHashMap<String, String>();
		// not throw exception at the time of iteration
		// it is fail safe
	
	       // Map<String, String> m = new HashMap<String, String>();
		// throw the exception at the time of iteration
		// is called as fail fast
	        m.put("Delhi", "India"); 
	        m.put("Moscow", "Russia"); 
	        m.put("New York", "USA"); 
	  
	        Set set =m.entrySet();
	        Iterator i=set.iterator();
	        while(i.hasNext()) {
	      Map.Entry m2=(Entry) i.next();
	      System.out.println(m2);
	      
	      m.put("kolka","sweet");
	        }
	}
}


