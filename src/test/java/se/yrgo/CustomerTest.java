package se.yrgo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomerTest {
    //Customer customer = new Customer("Max Andersson");

    @Test
    void testAddAccount() {
        //Creating a customer and two accounts.
        Customer customer = new Customer("Max Andersson");
        Account account1 = new Account("123");
        Account account2 = new Account("456");

        //Adding accounts to our customer Max.
        customer.addAccount(account1);
        customer.addAccount(account2);

        //Verifying that the accounts where added.
        assertTrue(customer.getAccounts().contains(account1));
        assertTrue(customer.getAccounts().contains(account2));
    }

    @Test
    void testGetAccount(){
        //Creating a Customer and a Account
        Customer customer = new Customer("Alex Gellato");
        Account account = new Account("123");

        //Assigning the Customer the Account.
        customer.addAccount(account);

        //Verifying that the Customer has a Account.
        assertEquals(1, customer.getAccounts().size());
        assertTrue(customer.getAccounts().contains(account));
    }

    @Test
    void testGetCurrentAccount(){
        Customer customer = new Customer("Alex Gellato");
        Account account1 = new Account("123");
        customer.addAccount(account1);

        customer.selectAccount("123");
        assertEquals(account1, customer.getCurrentAccount());
    }

    @Test
    void testSelectAccount(){
        Customer customer = new Customer("John Stew");
        Account account1 = new Account("123");
        Account account2 = new Account("456");

        customer.addAccount(account1);
        customer.addAccount(account2);

        // Selecting account1
        customer.selectAccount("123");

        // Verifying selected Account
        assertEquals(account1, customer.getCurrentAccount());

        // Switching to account2
        customer.selectAccount("456");

        // Verifying that the Account has been switched
        assertEquals(account2, customer.getCurrentAccount());
    }

    @Test
    void testTransferFunds(){
        Customer customer = new Customer("John Stew");
        Account account1 = new Account("123");
        Account account2 = new Account("456");

        customer.addAccount(account1);
        customer.addAccount(account2);

        // Depositing funds into account1
        account1.deposit(1000.0);

        // Selecting account1
        customer.selectAccount("123");

        // Transferring funds from account1 to account2
        double amountToTransfer = 500.0;
        customer.transferFunds(account2, amountToTransfer);

        // Verifying transfer
        Assertions.assertEquals(500.0, account1.getBalance(), 0.01);
        assertEquals(500.0, account2.getBalance(), 0.01);
        //The delta value of '0.01' for the 'assertEquals' calls to account for small differences in double precision.
    }
}
