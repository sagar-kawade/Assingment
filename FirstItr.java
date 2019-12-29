package com.custome.in;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class FirstItr {
	public static void main(String[] args) {
		Map<Integer, String> hm= new HashMap<>();
		hm.put(12, "Xyz");
		hm.put(11, "poo");
		hm.put(10, "ajay");
		hm.put(17, "aai");
		hm.put(121, "dada");
		hm.put(123, "baba");
		
		System.out.println("First way...Using iterator");
		Iterator <Map.Entry<Integer, String>> itr=hm.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<Integer, String> entry=itr.next();
			
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		System.out.println("Second way...Using lamda");
		hm.forEach((K,V)->  System.out.println(K+" "+V));
		
		System.out.println("Third way.. foreach loop");
		for (Map.Entry<Integer,String> entrys : hm.entrySet()) {
			System.out.println(entrys.getKey()+" "+entrys.getValue());
			
		}
		System.out.println("Fourth way...by keyset and values");
		for (Integer key : hm.keySet()) {
			System.out.println(key);
		
		}
		for (String value : hm.values()) {
			System.out.println(value);
			
		}
		System.out.println("Fifth way....on key and search for value");
		
		for (Integer keys : hm.keySet()) {
			System.out.println(keys+" "+hm.get(keys));
		
		}

	}

}
