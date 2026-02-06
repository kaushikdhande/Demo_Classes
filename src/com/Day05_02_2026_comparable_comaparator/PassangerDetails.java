package com.Day05_02_2026_comparable_comaparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.comparator.Employee;

public class PassangerDetails{
	public static void main(String[] args) {
	PassengerDetails p=new PassengerDetails(1000,"Khrish", "Gokul", "Vrindavan", "Train");
	PassengerDetails p1=new PassengerDetails(1002,"Ravi", "Gokul", "Vrindavan", "Train");
	PassengerDetails p2=new PassengerDetails(1001,"Kamlesh", "Gokul", "Vrindavan", "Train");
	PassengerDetails p3=new PassengerDetails(1004,"Joe", "Gokul", "Vrindavan", "Train");
	PassengerDetails p4=new PassengerDetails(1003,"Ben", "Gokul", "Vrindavan", "Train");
	ArrayList <PassengerDetails>al=new ArrayList();
	al.add(p);
	al.add(p1);
	al.add(p2);
	al.add(p3);
	al.add(p4);
	System.out.println(al);


	Collections.sort(al,new SortComplexObj());
	System.out.println(al);
	}
}

 class PassengerDetails {
	 int id;
		String name;
		String from ;
		String to;
		String medium;
		
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public void setMedium(String medium) {
		this.medium = medium;
	}
	
	public PassengerDetails(int id, String name, String from, String to, String medium) {
		super();
		this.id = id;
		this.name = name;
		this.from = from;
		this.to = to;
		this.medium = medium;
	}
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", from=" + from + ", to=" + to + ", medium=" + medium
				;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getFrom() {
		return from;
	}
	public String getTo() {
		return to;
	}
	public String getMedium() {
		return medium;
	}
	
//	public int compareTo(Object o) {
//		if(this.id>((PassengerDetails)(o)).id) {
//			return 1;
//		}
//		else {
//		return -1;
//	}
//	
//		}
	}
 
 class SortComplexObj implements Comparator{

		@Override
		public int compare(Object o1, Object o2) {
			// for integer id
//			if(((Employee)(o1)).id>((Employee)(o2)).id) {
//				return 1;
//			}
//			return -1;
			
			
//			for String name ;
			int res=(((PassengerDetails)(o1)).name).compareTo(((PassengerDetails)(o2)).name);
			if(res > 0) {
				return 1;
			}
			else {
			return -1;
			}
		}
		
		
	}

