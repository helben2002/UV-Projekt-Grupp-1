package se.yrgo;

import java.util.*;

/**
 * A class representing a bank account with methods to deposit and withdraw money.
 * The account also have a list with previously made transactions.
 */
public class Account {
    private String accountNumber;
    private double balance;
    private List<Transaction> transactions;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
        this.transactions = new ArrayList<>();
    }

    /**
     * If the amount is positive add it to account balance and record the transaction in the transaction list
     * @param amount the value to deposit to the account
     */
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add(new Transaction("Deposit", amount));
        } else {
            throw new IllegalArgumentException("Can't deposit a negative amount");
        }
    }

    /**
     * if the amount is positive and more than the balance of the account, withdraw amount from balance.
     * And record the transaction in the transaction list
     * @param amount the value to withdraw from the account
     */
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactions.add(new Transaction("Withdraw", amount));
        } else {
            throw new IllegalArgumentException("Can't deposit a negative amount or insufficient funds");
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