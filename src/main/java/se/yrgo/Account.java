package se.yrgo;


import java.util.*;

public class Account {
    private String accountNumber;
    private double balance;
    private List<Transaction> transactions;

    public Account(java.lang.String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    public void deposit(double amount){

    }

    public void withdraw(double amount){

    }

    public void transfer(Account receiverAccount, double amount){

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}
