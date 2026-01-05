package com.exceptionHandling;
import java.util.*;

public class TestApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main connection established");
		Test31 s1=new Test31();
		try {
			s1.gamma31();
		}catch(Exception e) {
			System.out.println("exception handled by main");
		}
		System.out.println("main connection terminated");

	}

}
class Test31{
	void gamma31() throws Exception{
		System.out.println("Connection 3 Established");
		Scanner in =new Scanner(System.in);
		System.out.println("ENter 1 ");
		int ab=in.nextInt();	
		System.out.println("ENter 2 ");
		int ba=in.nextInt();	
		int c=ab/ba;
		System.out.println(c);
		System.out.println("exception handled by gamma");
		System.out.println(" 3 connection terminated");

		
		}
}