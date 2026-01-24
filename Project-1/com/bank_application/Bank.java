package com.bank_application;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {

    private ArrayList<User> users = new ArrayList<>();
    private ArrayList<Transaction> transactions = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void createAccount() {
//        System.out.print("Enter User ID: ");
        int  userId =1;

        System.out.print("Enter User Name: ");
        String name = sc.next();

        System.out.print("Enter Account Number: ");
        String accNo = sc.next();   
        
        System.out.print("Enter Initial Balance: ");
        double bal = sc.nextDouble();

        Account account = new Account(accNo, name, bal);
        User user = new User(userId++, name, account);

        users.add(user);

        System.out.println("User and Account Created Successfully!");
    }

    private Account findAccount(String accNo) {
        for (User user : users) {
            if (user.getAccount().getAccountNumber().equals(accNo)) {
                return user.getAccount();
            }
        }
        return null;
    }

    public void viewBalance() {
        System.out.print("Enter Account Number: ");
        String accNo = sc.next();

        Account acc = findAccount(accNo);
        if (acc != null) {
            System.out.println("Balance: " + acc.getBalance());
        } else {
            System.out.println("Account not found!");
        }
    }

    public void depositMoney() {
        System.out.print("Enter Account Number: ");
        String accNo = sc.next();

        System.out.print("Enter Amount: ");
        double amt = sc.nextDouble();

        Account acc = findAccount(accNo);
        if (acc != null) {
            acc.deposit(amt);
            transactions.add(new Transaction("Deposit", amt, accNo));
            System.out.println("Deposit Successful!");
        } else {
            System.out.println("Account not found!");
        }
    }

    public void withdrawMoney() {
        System.out.print("Enter Account Number: ");
        String accNo = sc.next();

        System.out.print("Enter Amount: ");
        double amt = sc.nextDouble();

        Account acc = findAccount(accNo);
        if (acc != null && acc.withdraw(amt)) {
            transactions.add(new Transaction("Withdraw", amt, accNo));
            System.out.println("Withdrawal Successful!");
        } else {
            System.out.println("Insufficient balance or account not found!");
        }
    }

    public void transferFund() {
        System.out.print("From Account: ");
        String from = sc.next();

        System.out.print("To Account: ");
        String to = sc.next();

        System.out.print("Amount: ");
        double amt = sc.nextDouble();

        Account accFrom = findAccount(from);
        Account accTo = findAccount(to);

        if (accFrom != null && accTo != null && accFrom.withdraw(amt)) {
            accTo.deposit(amt);
            transactions.add(
                new Transaction("Transfer", amt, from + " to " + to)
            );
            System.out.println("Transfer Successful!");
        } else {
            System.out.println("Transfer Failed!");
        }
    }

    public void transactionHistory() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions available.");
        } else {
            for (Transaction t : transactions) {
                System.out.println(t);
            }
        }
    }
}
