import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class AverageMethodTest {

    @Test
    void Sum() {
        assertEquals(6, AverageMethod.sum(2,2,2));
    }

    @Test
    void average() {
        assertEquals(2, AverageMethod.average(AverageMethod.sum(2,2,2)));
    }
}