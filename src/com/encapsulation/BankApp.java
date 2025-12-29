package com.encapsulation;
import java.util.*;
public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the amout to deposit :");
		Bank b=new Bank();
		int bal =sc.nextInt();
		b.setBalance(bal);
		System.out.println("current Balance :"+b.getBalance());
		System.out.println("enter amount to witdrwal");
		int w=sc.nextInt();
		int upd_bal= b.getBalance() -w;
		System.out.println("current bal :"+upd_bal);
				
	}	
	

}
class Bank{
	private int balance;
	public void setBalance(int bal) {
		balance=bal;
	}
	public int getBalance() {
		return balance;
	}
	
	
}
