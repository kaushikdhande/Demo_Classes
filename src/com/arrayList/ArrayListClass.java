package com.arrayList;

import java.util.ArrayList;

public class ArrayListClass {
	public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(10);
	al.add(20);
	al.add(30);
	al.add(40);
	al.add("Kaushik");
	al.add(10.4);
	al.add(true);
	System.out.println("List 1"+ al);
	ArrayList al1=new ArrayList();
	al1.add(100);
	al1.add(200);
	al1.add(309);
	al1.add(407);
	System.out.println("List 2"+ al1);
	al.addAll(al1); 	// add all collection in one list
	System.out.println("List "+ al);
	al.add(1, 99); //add index on that index and move all element back
	System.out.println("List 1"+ al);
	System.out.println(al.contains(20));	// return boolean (checks)
	al.remove(1);	// remove specific index value
	System.out.println("List 1"+ al);
//	al.removeAll(al); remove all element from list
	System.out.println("List 1");
	al1.set(1, 111);// overide the value of index
	System.out.println(al1);
	al.retainAll(al1);
	System.out.println(al);



	
	}
}
