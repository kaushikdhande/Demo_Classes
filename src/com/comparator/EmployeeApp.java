package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class EmployeeApp{
	public static void main(String[] args) {
		Employee e=new Employee(101,"Lala",2000);
		Employee e1=new Employee(103,"Jala",2300);
		Employee e2=new Employee(102,"Mala",700);
		Employee e3=new Employee(105,"Leela",300);
		Employee e4=new Employee(104,"Jayesh",1200);
		ArrayList <Employee>al=new ArrayList<>();
		al.add(e);
		al.add(e1);
		al.add(e2);
		al.add(e4);
		al.add(e3);
		System.out.println(al);
		SortComplexObj s=new SortComplexObj();
		
		Collections.sort(al,s);
		System.out.println(al);
	}
}


class Employee {
	int id;
	String name;
	int salary;
	
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	public String toString() {
		return id+" "+name+" "+salary;
		
	}
}


class SortComplexObj implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// for integer id
//		if(((Employee)(o1)).id>((Employee)(o2)).id) {
//			return 1;
//		}
//		return -1;
		
		
//		for String name ;
		int res=(((Employee)(o1)).name).compareTo(((Employee)(o2)).name);
		if(res > 0) {
			return 1;
		}
		return -1;
	
	}
	
	
}
