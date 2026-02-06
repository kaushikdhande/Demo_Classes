package com.sotingcomplexobject;

import java.util.ArrayList;
import java.util.Collections;

public class SotingComplexObject {

	public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(100);
	al.add(50);
	al.add(30);
	al.add(40);
	al.add("Kaushik");
	al.add(10.4);
	al.add(true);
	Collections.sort(al);
	System.out.println(al);  // generic (avoid complex program)
	}

}
