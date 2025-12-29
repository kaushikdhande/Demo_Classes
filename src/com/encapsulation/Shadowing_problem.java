package com.encapsulation;

import java.util.Scanner;

class Stud_entt{
	 private String name;
	private int age;
	private String gender;
	
	//optimize way to set method bcoz it does not return
	
	public Stud_entt(String name,int age,String gender) {
	this.name=name;																			
	this.age=age;																//setter method can created one times but getter needed to be call for every set indivdual data member  
	this.gender=gender;
	}
//	
	//name
//	
	 public String getName() {
		 return name;
	 }
	 
	 //age

	 int getAge() {
		 return age;
	 }
	 
	 //gender
//	
	 String getGender() {
		 return gender;
	 }
}

public class Shadowing_problem {


		public static void main(String[] args) {
			
			Scanner in=new Scanner(System.in);
			Stud_entt s=new Stud_entt("Arsh",50,"male");
//			System.out.println("Enter name :");
//			String n=in.nextLine();
//			s.setName(n);
			System.out.println("" +s.getName());
			
//			System.out.println("Enter age :");
//			int a=in.nextInt();
//			s.setAge(a);
			System.out.println("" +s.getAge()); 
			
//			String g=in.nextLine();
//			s.setGender(g);
			System.out.println("" +s.getGender());

		}

	}

