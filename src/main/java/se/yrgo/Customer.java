package se.yrgo;

import java.util.ArrayList;
import java.util.List;

/**
 * A class representing Customers with methods to switch between Accounts
 * and Transfer Funds (between Account (and presumably in a non-Simple Bank System, between Customers)).
 */
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

    public List<Account> getAccounts(){
        return accounts;
    }
}
