package com.encapsulation;
		// consructor chaining and local chaining

class Employeee1 extends Object{
	int e_id;
	String e_name;
	int e_sal;
	public Employeee1(int e_id,String e_name,int e_sal) {
		super();
		this.e_id=e_id;
		this.e_name=e_name;
		this.e_sal=e_sal;
	}
	
	int  getId() {
		return e_id;
	}
	String getName() {
		return e_name;
	}
	int getSalary() {
		return e_sal;
	}
	public Employeee1() {
		this(101,"arsh",20000);
	}
	
}

public class Constructor_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated m
		
		Employeee1 em =new Employeee1(); 
		System.out.println(em.getId());
		System.out.println(em.getName());
		System.out.println(em.getSalary());
		
//		Employeee em1 =new Employeee(101,"Lokesh",20000);
//		System.out.println(em.getId());
//		System.out.println(em.getName());
//		System.out.println(em.getSalary());
//
	}

}
