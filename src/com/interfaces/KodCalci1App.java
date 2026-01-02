package com.interfaces;
import java.util.*;
public class KodCalci1App {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter value of a");
		int m=in.nextInt();
		System.out.println("Enter value of a");
		int n=in.nextInt();
		System.out.println("Enter value of operator + - * /");
		String op=in.next();
		in.nextLine();
		char operator =op.charAt(0);
		switch(operator) {
		case '+':{
			System.out.println(m+n);
			break;
		}
		case '-':{
			System.out.println(m-n);
			break;
		}
		case '*':{
			System.out.println(m*n);
			break;
		}
		case '/':{
			System.out.println(m/n);
			break;
		}
		
	
		
		
		
	}
	
	}
	static void duty1(KodCalci1 c ,char operator) {
		c.add1();
		c.sub1();
		c.mul1();
		c.div1();
	}
	

}
//class Rupeshinfo_tech implements KodCalci1{
//	
//}
