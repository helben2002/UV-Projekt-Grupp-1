package se.yrgo;

import java.util.*;

public class Account {
    private String accountNumber;
    private double balance;
    private List<Transaction> transactions;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
        this.transactions = new ArrayList<>();
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add(new Transaction("Deposit", amount));
        } else {
            throw new IllegalArgumentException("Can't deposit negative amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactions.add(new Transaction("Withdraw", amount));
        } else {
            throw new IllegalArgumentException("Can't withdraw negative amount or insufficient funds");
        }
    }

    public void transfer(Account receiverAccount, double amount) {
        if (amount > 0 && amount < balance) {
            balance -= amount;
            receiverAccount.deposit(amount);
            transactions.add(new Transaction("Transfer to account: " + receiverAccount, amount));
        }
        else {
        throw new IllegalArgumentException("Can't transfer negative amount or insufficient funds");
        }
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
