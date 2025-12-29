package com.encapsulation;
import java.util.*;
class Student{
	 private String name;
	private int age;
	private String gender;
	
	//optimize way to set method bcoz it does not return
	
//	void setData(String name,int age,String gender) {
//	name=n;																			
//	age=a;																setter method can created one times but getter needed to be call for every set indivdual data member  
//	gender=g
//	}
//	
	//name
	public  void setName(String n){
		  name=n;
	}
	 public String getName() {
		 return name;
	 }
	 
	 //age
	 void setAge(int a){
		 age =a;
	}
	 int getAge() {
		 return age;
	 }
	 
	 //gender
	 void setGender(String g){
		 gender=g;
		
	}
	 String getGender() {
		 return gender;
	 }
}

public class StudentApp {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		Student s=new Student();
		System.out.println("Enter name :");
		String n=in.nextLine();
		s.setName(n);
		System.out.println("" +s.getName());
		
		System.out.println("Enter age :");
		int a=in.nextInt();
		s.setAge(a);
		System.out.println("" +s.getAge());
		
		System.out.println("Enter gender :");
		String g=in.nextLine();
		s.setGender(g);
		System.out.println("" +s.getGender());

	}

}
