import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    @Test
    void getNumber() {
        Counter counter = new Counter(15);
        assertEquals(15, counter.getNumber());
    }
}