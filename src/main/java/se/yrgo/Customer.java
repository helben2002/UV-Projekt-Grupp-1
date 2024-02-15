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
    private Account selectedAccount;
    private List<Account> accounts;

    public Customer(String name){
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    /**
     * Assings Accounts as being owned by a specific Customer.
     * @param account the account that gets assigned to this customer
     */
    public void addAccount(Account account){
        accounts.add(account);
    }

    public List<Account> getAccounts(){
        return accounts;
    }

    public Account getCurrentAccount() {
        return selectedAccount;
    }

    /**
     * Defunct: Was used to select the current account that a customer owns.
     * @param accountNumber
     */
    public void selectAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                selectedAccount = account;
                return;
            }
        }
        // If the account with the given number is not found, throw an exception or handle it accordingly.
        throw new IllegalArgumentException("Account not found");
    }


    /**
     * Allows for the transferance of funds between the current (selected) account and the target account.
     * It is defunct and never used for the project.
     * @param targetAccount the account that funds are transfered to.
     * @param amount the amount that is transfered
     */
    public void transferFunds (Account targetAccount, double amount) {
        if (selectedAccount == null){
            throw new IllegalStateException("No account selected");
        }
        if (amount <= 0){
            throw new IllegalArgumentException("Invalid Amount");
        }
        selectedAccount.withdraw(amount);
        targetAccount.deposit(amount);
    }
}

