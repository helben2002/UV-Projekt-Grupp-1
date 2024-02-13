package se.yrgo;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    //Create atleast 2 Customers through Account
    private String name;
    private List<Account> accounts;

    public Customer(String name){
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account){
        accounts.add(account);
    }

    public List<Account> geAccounts(){
        return accounts;
    }

    public void transfer(Account recipient, double amount, String description){
        // Transfer funds from this account to the recipient's account
    }
}
