import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void getDogName() {
        Animal animal = new Animal("Oakley");
        assertEquals("Oakley", animal.getDogName());
    }
}