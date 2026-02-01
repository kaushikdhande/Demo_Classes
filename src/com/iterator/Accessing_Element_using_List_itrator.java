package com.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Accessing_Element_using_List_itrator {

	public static void main(String[] args) {
		ArrayList as=new ArrayList();
		as.add(100);
		as.add(50);
		as.add(150);
		as.add(25);
		as.add(75);
		as.add(125);
		as.add(175);
		
//		Iterator itrr=as.iterator();
//		while(itrr.hasNext()) {
//			System.out.println(itrr.next());
//		}
		//to operate list backward 
//		ListIterator itrr=as.listIterator();
//		while(itrr.hasNext()) {
//			System.out.println(itrr.next());
//		}
//		----------------------------------------------------
		ListIterator itrr=as.listIterator(as.size());
		while(itrr.hasPrevious()) {
			System.out.println(itrr.previous());
		}
		}
		

}
