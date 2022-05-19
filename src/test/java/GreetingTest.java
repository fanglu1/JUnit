import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    @Test
    void getInput() {
        String name = "Fang";
        InputStream in = new ByteArrayInputStream(name.getBytes());
        System.setIn(in);
        assertEquals("Hi Fang", Greeting.getInput());
    }
}