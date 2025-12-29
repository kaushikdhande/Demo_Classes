package com.encapsulation;
			//constructor
class Employeee extends Object{
	int e_id;
	String e_name;
	int e_sal;
	public Employeee(int e_id,String e_name,int e_sal) {
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
	
	
}

	class Object{
	public Object() {
		
	}
}

public class Oobject_classApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employeee em =new Employeee(101,"Lokesh",20000);
//		Employeee em =new Employeee();
		System.out.println(em.getId());
		System.out.println(em.getName());
		System.out.println(em.getSalary());
		
		
	}

}
//in above program compiler will look for such constructor which doesnot accept but there is no such consructor in our class 
//and hence we going to get compile time error 

// only and only if the programmer has not defined a consructor in the class the complier will add zero parameterzied constructor

//such aconsructor which is provided by a compiler when no constructor was provided by prgrammer is default consructor


