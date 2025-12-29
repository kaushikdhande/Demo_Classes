package com.encapsulation;

import java.util.Scanner;

class Employee{
	private int id;
	private String em_Name;
	private int salary;
	
	public Employee(int i,String em_n,int sal) {
		
		id=i;
		em_Name=em_n;
		salary=sal;	
	}
	public int  getId() {
		return id;
	}
	public String  getName() {
		return em_Name;
	}
	public int  getSalary() {
		return salary;
	}
}

public class EmployeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("enter the id ");
		int i=in.nextInt();in.nextLine();
		System.out.println("enter the employee name");
		String em_Name=in.nextLine();
		System.out.println("enter the salary ");
		int sal=in.nextInt();
		// constructor is special set method to initalize object
		Employee e=new Employee( i, em_Name, sal);

		System.out.println("" +e.getId());
		
		
		
		System.out.println("" +e.getName());
		
		
		System.out.println("" +e.getSalary());

	}

}
