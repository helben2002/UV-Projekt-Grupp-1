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

    public void deposit(double amount) {
        if (amount > 0){
            balance += amount;
        }
        else{
            throw new IllegalArgumentException("Can't deposit negative amount");
        }
    }

    public void withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
        }
        else{
            throw new IllegalArgumentException("Can't withdraw negative amount");
        }
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
