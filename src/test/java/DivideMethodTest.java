import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideMethodTest {


    @Test
    void divide() {
        assertEquals(6, DivideMethod.divide(12, 2));
    }
}