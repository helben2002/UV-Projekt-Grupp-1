package se.yrgo;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    Account account = new Account("123456");


    @Test
    public void testDepositPositiveAmount(){
        double startBalance = account.getBalance();
        double deposit = 100;
        account.deposit(deposit);
        assertEquals(startBalance + deposit, account.getBalance());
    }

    // denna failar just nu eftersom allt inte är klart i klasserna, men borde funka sen ->
//    @Test
//    public void testAddingTransaction(){
//        double deposit = 100;
//        account.deposit(deposit);
//        assertEquals(1, account.getTransactions().size());
//    }

}
