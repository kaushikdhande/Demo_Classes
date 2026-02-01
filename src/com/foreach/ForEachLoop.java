package com.foreach;

import java.util.ArrayList;

public class ForEachLoop {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		a.add(70);
		for(Integer u:a) { // 
			System.out.println(u);
		}
		System.out.println("-------------------------");
		for(Object u:a) { // 
			System.out.println(u);
		}
		ArrayList <String>s=new ArrayList<>();
		s.add("Mayur");
		s.add("jai");
		s.add("Rakesh");
		s.add("Mayur");
		
//		for(String m:s) {
//			System.out.println(m);
//		}
		for(int i=0;i<s.size();i++) {
			System.out.println(s.get(i));
		}
	}

}
