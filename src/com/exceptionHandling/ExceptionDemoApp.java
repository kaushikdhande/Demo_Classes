package com.exceptionHandling;


import java.util.*;
public class ExceptionDemoApp {

	public static void main(String[] args) {
		System.out.println("connection Established !");
		Scanner in=new Scanner(System.in);
		try {
			System.out.println("please enter 1 value");
			int a=in.nextInt();
			System.out.println("please enter 2 value");
			int b=in.nextInt();
			int c=a/b;					//rts  error of( /zero)  rts ka object bata  
			System.out.println(c);
			System.out.println("Enter size of Array");
			int size =in.nextInt();
			
			int [] arr=new int [size];
			
			System.out.println("Enter index  of Array");
			int n =in.nextInt();
			arr[n]=999;
			
			
		}
		catch(ArithmeticException  e) {
//			e.printStackTrace();  		//to get line No.15 
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException  e) {
//			e.printStackTrace();  		//to get line No.15 
			System.out.println(e);
		}
		catch(NegativeArraySizeException  e) {
//			e.printStackTrace();  		//to get line No.15 
			System.out.println(e);
		}
		catch(Exception  e) {
//			e.printStackTrace();  		//to get line No.15 
			System.out.println(e);
		}
		finally {
			System.out.println("exception handled ");
		}
		System.out.println("connectio terminated");
		
		
	}

}
