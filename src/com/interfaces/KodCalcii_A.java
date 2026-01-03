package com.interfaces;

import java.util.Scanner;

public class KodCalcii_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			duty1(new RupeshSoft ());
	}
	static void duty1(RupeshSoft r) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter value of a");
		int m=in.nextInt();
		System.out.println("Enter value of b");
		int n=in.nextInt();
		System.out.println("Enter value of operator + - * /");
		String op=in.next();
		in.nextLine();
		char operator =op.charAt(0);
		switch(operator) {
		case '+':{
			r.add();
			break;
		}
		case '-':{
			r.sub();
			break;
		}
		case '*':{
			r.mul();
			break;
		}
		case '/':{
			r.div();
			break;
		}
		case '%':{
			r.mod();
			break;
		}
		
	}

}
}
interface KodCalci_3 {
	public final static int a=10;
 	void add();
	void sub();
}
interface KodCalci_4 extends KodCalci_3{
	void mul();
	void div();
	void mod();
	}
// multiple inheritence is achevied with genric
 class RupeshSoft extends  Object implements KodCalci_3,KodCalci_4{	// first extends (parent)(Object ) then implerment interface 
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
	public void mod() {
		int a=10;
		int b=20;
		int c=a%b;
		System.out.println(c);
	}

}