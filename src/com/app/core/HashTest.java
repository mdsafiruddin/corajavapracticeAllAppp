package com.app.core;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashTest {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Map m=new LinkedHashMap();
		/*m.put(null, "kube");
		m.put(null, "raja");
		m.put(112,"java");
		m.put(114,"java");
		m.put(113,"java");
		m.put(115,"java");
		m.put(116,"java");*/
		
		m.put("raja", "kube");
		m.put("servent", "raja");
		m.put("top","java");
		m.put("topper","java");
		m.put("topp","java");
		m.put("roll","java");
		m.put("kosih","java");
		
		System.out.println(m);
		
		 Set s=m.entrySet();
		 s.forEach(System.out::println);
		 
		 System.out.println("-------------------");
		 for(Object obj: m.keySet()) {
			 
		System.out.println(s+" " +m.get(obj));
	
		
		 }
		

	}
}
