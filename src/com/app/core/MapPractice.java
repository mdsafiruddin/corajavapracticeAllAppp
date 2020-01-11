package com.app.core;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapPractice {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
	
		Map<String,String> m=new LinkedHashMap<String, String>();
		m.put("core", "raja");
		m.put("adv", "rmaa");
		m.put("spring", "rama");
		m.put("jdbc", "rjama");
		m.put("ksp", "rakas");
		
		System.out.println(m);
		System.out.println("------for-------");
		Set s=m.entrySet();
		s.forEach(System.out::println);
		
		java.util.Iterator r= s.iterator();
		while(((java.util.Iterator) r).hasNext()) {
		
		Map.Entry entry=(Entry) ((java.util.Iterator) r).next();
		System.out.println(entry.getKey()+"--"+entry.getValue());
			
		}
	}

}
