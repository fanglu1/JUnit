import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccTest {

    @Test
    void deposit() {
        BankAcc deposits = new BankAcc(10, "Savings");
        assertEquals(10.0, BankAcc.deposit(10));
    }

    @Test
    void withdrawal() {
        BankAcc withdrawals = new BankAcc(10, "Savings");
        assertEquals(10.0, BankAcc.withdrawal(10));
    }
}