package com.exceptionHandling;
import java.util.*;
public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new Bank();
		b.banking();
		}
}
class Bank{
	void banking() {
		System.out.println("Bank connection established");
		ATM card=new ATM();
		try {
			card.transaction();
			
		}catch(Exception e) {
			System.out.println("Info received by the bank your amount will refunded in next 24 working hours.");
		}
		System.out.println("Bank connection Terminated");
	}
		
}

class ATM {
	void transaction() throws Exception {
		System.out.println("ATM connection established");
		Scanner s=new Scanner(System.in);
		System.out.println("enter v1 :");
		int m=s.nextInt();
		System.out.println("enter v2 :");
		int n=s.nextInt();
		try {
			int c=m/n;
			System.out.println(c);
		}catch(Exception e) {
			System.out.println("Exception handled by atm");
			throw e;
		}
	
		System.out.println("ATM Conection Terminated");
		s.close();
	}

}
