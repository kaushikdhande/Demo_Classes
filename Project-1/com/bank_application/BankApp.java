package com.bank_application;
import java.util.Scanner;

import java.util.*;
public class BankApp {

	
	    public static void main(String[] args) {
	        Bank bank = new Bank();
	        Scanner sc = new Scanner(System.in);

	        while (true) {
	            System.out.println("\n--- Online Banking System ---");
	            System.out.println("1. Create Account");
	            System.out.println("2. View Balance");
	            System.out.println("3. Deposit Money");
	            System.out.println("4. Withdraw Money");
	            System.out.println("5. Transfer Funds");
	            System.out.println("6. Transaction History");
	            System.out.println("7. Exit");

	            System.out.print("Enter choice: ");
	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1 -> bank.createAccount();
	                case 2 -> bank.viewBalance();
	                case 3 -> bank.depositMoney();
	                case 4 -> bank.withdrawMoney();
	                case 5 -> bank.transferFund();
	                case 6 -> bank.transactionHistory();
	                case 7 -> {
	                    System.out.println("Thank you!");
	                    return;
	                }
	                default -> System.out.println("Invalid Choice!");
	            }
	        }
	    
	}

}

		