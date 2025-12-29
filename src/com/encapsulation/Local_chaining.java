package com.encapsulation;
							// local chaining concept
class Employee12{
	int e_id;
	String name;
	int sala;
	
	public Employee12(){
		this(101,"Arsh",20000);
		System.out.println("0 parameterized ");
	}
	
	public Employee12(int e_id){
		
		System.out.println("1 parameterized ");
	}
	
public Employee12(int e_id,String name){
		this(101);
		System.out.println("2 parameterized ");
	}
public Employee12(int e_id,String name ,int sala){
	this(101,"Arsh");
	System.out.println("3 parameterized ");
}
}


public class Local_chaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee12 em2=new Employee12();
	}

}
