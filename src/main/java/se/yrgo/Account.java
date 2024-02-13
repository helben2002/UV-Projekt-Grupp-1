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
            System.out.println("You can't deposit a negative amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactions.add(new Transaction("Withdraw", amount));
        } else if (amount <= 0) {
            System.out.println("you can't withdraw a negative amount.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }


    public void transfer(Account receiverAccount, double amount) {
        if (amount > 0 && amount < balance) {
            balance -= amount;
            receiverAccount.deposit(amount);
            transactions.add(new Transaction("Transfer to account: " + receiverAccount, amount));
        } else if (amount <= 0) {
            System.out.println("you can't withdraw a negative amount.");
        } else {
            System.out.println("Insufficient funds.");
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
