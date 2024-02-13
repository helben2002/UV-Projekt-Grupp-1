package se.yrgo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
}
