package com.mapinterface;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;

public class HashMapEx {

	public static void main(String[] args) {

		Hashtable<Integer, String> map = new Hashtable<>();
		map.put(101, "Vicky");
		map.put(102, "Sandy");
		map.put(103, "Vicky");
		map.put(104, "John");
		map.put(110, "Sam");
//
//		for (Entry<Integer, String> e : map.entrySet()) {
//			System.out.println(e.getKey() + " : " + e.getValue());
//		}

		Enumeration<Integer> e = map.keys();

		while (e.hasMoreElements()) {
			Integer key = e.nextElement();
			String value = map.get(key);
			System.out.println(key + " : " + value);

		}
		
	
		Iterable
		

	}
}
