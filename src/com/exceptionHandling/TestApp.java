package com.exceptionHandling;

import java.util.*;
public class TestApp {

	public static void main(String[] args) {
		System.out.println("Main connection established");
		Test1 t1=new Test1();
		t1.alpha();
		System.out.println("main connection terminated");

	}

}
class Test1{
	void alpha() {
		System.out.println("1  connection established");
		Test2 t2=new Test2();
		t2.beta();
		System.out.println("1  connection terminated");

	}
}
class Test2{
	void beta() {
		System.out.println("2  connection established");
		Test3 t2=new Test3();
		try {
		t2.gamma();
		}catch(Exception e) {
		System.out.println("2  connection terminated");
		}
	}
}
class Test3{
	void gamma() {
		System.out.println("3  connection established");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 value :");
		int a=sc.nextInt();
		System.out.println("Enter 2 value :");
		int b=sc.nextInt();
		try {			
		int c=a/b;					// exception at 44 line
		System.out.println(c);
		}catch (Exception e) {
			System.out.println("exception handled by gamma");
		}
		System.out.println("3  connection terminated");
		sc.close();
		
	}
}
