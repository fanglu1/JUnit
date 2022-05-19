import org.junit.jupiter.api.Test;
import org.xml.sax.InputSource;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class SuperheroTest {

    @Test
    void superheroPower() {
        String name = "teleport";
        InputStream in = new ByteArrayInputStream(name.getBytes());
        System.setIn(in);
        assertEquals("My superpower is teleport", Superhero.superheroPower());
    }
}