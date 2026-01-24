package com.bank_application;
public class User {
    private int userId;
    private String name;
    private Account account;

    public User(int  userId, String name, Account account) {
        this.userId = userId;
        this.name = name;
        this.account = account;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }
}
