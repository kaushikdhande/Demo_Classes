package com.exceptionHandling;
import java.util.Scanner;

public class BankValidation {

	public static void main(String[] args) {
	Bankk b = new Bankk();
	b.acceptInfo();
	b.verify();

	}
}

class Bankk{
	int accNo = 123;
	int pass = 123;
	int u_acc;
	int u_pass;
	

	void acceptInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Account Number :");
		u_acc = sc.nextInt();
		
		System.out.println("Enter the password :");
		u_pass= sc.nextInt();
		
		sc.close();
	}

	void verify() {
		if(u_acc == accNo && u_pass == pass) {
			System.out.println("Information is Verify");
		}
		else {
			InvalidInputException e = new InvalidInputException();
			System.out.println(e.getMessage()); 
			}		
	}
}
class InvalidInputException extends Exception{
	public String getMessage() {
		return "Wrong crendentials";
	}
}
