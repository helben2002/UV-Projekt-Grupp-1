package se.yrgo;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Helene och Tomas hjälptes åt med testerna till denna klass
 */
public class AccountTest {

    private Account account;

    @BeforeEach
    void setUp() {
        account = new Account("123456");
    }

    @Test
    void depositNegativeAmount_ThrowException(){
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-100));
    }

    @Test
    void withdrawNegativeAmount_ThrowException(){
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-100));
    }

    @Test
    void withdrawMoreThanBalance_ThrowException(){
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(50));
    }

    @Test
    void depositValidAmountBalanceIncreased() {
        account.deposit(100.0);
        assertEquals(100.0, account.getBalance());
    }

    @Test
    void withdrawValidAmount_balanceDecreased() {
        account.deposit(100.0);
        account.withdraw(50.0);
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
