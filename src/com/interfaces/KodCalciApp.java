package com.interfaces;

import java.util.*;
public class KodCalciApp {

	public static void main(String[] args) {
		duty(new AyushInfo_tech());
			
		}
		
	static void duty(KodCalci k) {
		k.add();
		k.sub();
		k.mul();
		k.div();
	}
}
class RupeshInfo_tech implements KodCalci{

	public void add() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		
	}

	
	public void sub() {
		int a=10;
		int b=20;
		int c=a-b;
		System.out.println(c);
	}
	
	public void mul() {
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println(c);
	}

	public void div() {
		int a=10;
		int b=20;
		int c=a/b;
		System.out.println(c);
	}
	
}
class AyushInfo_tech implements KodCalci{
	Scanner sc=new Scanner(System.in);

	
	public void add() {
		System.out.println("enter value of a :");
		int a=sc.nextInt();	
		System.out.println("enter value of b :");
		int b=sc.nextInt();	
		int c=a+b;
		System.out.println(c);
	}

	
	public void sub() {
		System.out.println("enter value of a :");
		int a=sc.nextInt();	
		System.out.println("enter value of b :");
		int b=sc.nextInt();	
		int c=a-b;
		System.out.println(c);
		}

	
	public void mul() {
		System.out.println("enter value of a :");
		int a=sc.nextInt();	
		System.out.println("enter value of b :");
		int b=sc.nextInt();	
		int c=a*b;
		System.out.println(c);
	}

	
	public void div() {
		System.out.println("enter value of a :");
		int a=sc.nextInt();	
		System.out.println("enter value of b :");
		int b=sc.nextInt();	
		int c=a/b;
		System.out.println(c);
	}
	
}