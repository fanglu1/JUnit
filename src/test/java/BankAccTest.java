import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccTest {

    @Test
    void deposit() {
        assertEquals(10.0, BankAcc.deposit(10));
    }

    @Test
    void withdrawal() {
        assertEquals(10.0, BankAcc.withdrawal(10));
    }
}