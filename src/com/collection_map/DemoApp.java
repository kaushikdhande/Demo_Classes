package com.collection_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class DemoApp {
	public static void main(String[] args) {
		HashMap h=new HashMap();
		h.put(100, 99);
		h.put(50, 999);
		h.put(150, 9999);
		h.put(25, 99999);
		h.put(75, 999999);
		h.put(75, 9999999);
		h.put(125, 9999999);
		System.out.println(h);
		System.out.println("-------------------------------------");
		Set ss=h.keySet();
		Iterator itr=ss.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("------------------------------------");
		Collection c=h.values();
		System.out.println("Values");
		Iterator itr1=c.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}	
		System.out.println("------------------------------------");

		
		Set s1=h.entrySet();
		System.out.println("Entery set");
		
		Iterator itr2=ss.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		}

}
