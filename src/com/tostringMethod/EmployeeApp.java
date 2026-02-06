package com.tostringMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeApp {

	public static void main(String[] args) {
	Employee e=new Employee(101,"Lala",2000);
	Employee e1=new Employee(103,"Jala",2300);
	Employee e2=new Employee(102,"Mala",700);
	Employee e3=new Employee(105,"Leela",300);
	Employee e4=new Employee(104,"Jayesh",1200);
	System.out.println(e); 		// by default e.toString()
	ArrayList al=new ArrayList();
	al.add(e);
	al.add(e1);
	al.add(e2);
	Collections.sort(al);
	System.out.println(al);
	}

}

class Employee implements Comparable{
	
	
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

	@Override
	public int compareTo(Object o) {
		if(this.id>(((Employee)(o)).id)){
			return 1;
		}
		else {
			return -1;
		}
	
	}
	
}



