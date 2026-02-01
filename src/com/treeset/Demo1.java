package com.treeset;

import java.util.TreeSet;

public class Demo1 {
public static void main(String[] args) {
	TreeSet ts=new TreeSet();
	ts.add(100);
	ts.add(50);
	ts.add(150);
	ts.add(25);
	ts.add(75);
	ts.add(125);
	ts.add(175);
	System.out.println(ts);
	System.out.println("-------UPPER------------");
	System.out.println(ts.floor(75));
	System.out.println("-------------------");
	System.out.println(ts.lower(75));
	System.out.println("-------------------");
	System.out.println(ts.floor(70));
	System.out.println("-------------------");
	System.out.println(ts.lower(70));
	
	System.out.println("-------------------------");
	System.out.println(ts);
	System.out.println(ts.headSet(75));
	System.out.println(ts.tailSet(75)); 


	


	
}
}
