package com.inheritence_1;



public class Finals_keyword {
//  final int b = 10;
	public static void main(String[] args) {
		
//  final int a;
//    a=20;
//    a=30;
//    System.out.println(a);
		
		Child1 c = new Child1();
		c.disp();
	}

}
class Parent12 {
	int x =10;
//	void disp() {
//		System.out.println(x);
//	}
	final void disp() {
		System.out.println("Parent");
		
	}
}
class Child1 extends Parent12{
	int x =20;
//	void disp() {
//		System.out.println("Child");  
//		
//	}
}