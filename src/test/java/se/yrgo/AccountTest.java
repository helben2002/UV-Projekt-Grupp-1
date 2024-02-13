package se.yrgo;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AccountTest {

    private Account account;

    @BeforeEach
    void setUp() {
        account = new Account("123456");
    }

    @Test
    void depositValidAmountBalanceIncreased() {
        account.deposit(100.0);
        assertEquals(100.0, account.getBalance());
    }

    @Test
    void depositNegativeAmount_noChangeInBalance() {
        account.deposit(100.0);
        account.deposit(-50.0);
        assertEquals(100.0, account.getBalance());
    }

    @Test
    void withdrawValidAmount_balanceDecreased() {
        account.deposit(100.0);
        account.withdraw(50.0);
        assertEquals(50.0, account.getBalance());
    }

    @Test
    void withdrawNegativeAmount_noChangeInBalance() {
        account.deposit(100.0);
        account.withdraw(-50.0);
        assertEquals(100.0, account.getBalance());
    }

    @Test
    void withdrawInsufficientFunds_noChangeInBalance() {
        account.deposit(50.0);
        account.withdraw(100.0);
        assertEquals(50.0, account.getBalance());
    }


    @Test
    void getAccountNumberReturnsCorrectNumber() {
        assertEquals("123456", account.getAccountNumber());
    }

    @Test
    void getBalanceReturnsCorrectBalance() {
        account.deposit(50.0);
        assertEquals(50.0, account.getBalance());
    }

    @Test
    void getTransactionsReturnsEmptyListInitially() {
        assertTrue(account.getTransactions().isEmpty());
    }

    @Test
    void getTransactionsReturnsCorrect() {
        account.deposit(50);
        assertEquals(1, account.getTransactions().size());
    }

}
