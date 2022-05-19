import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BooksTest {

//    Day 59 testing
//    @Test
//    void getTitle() {
//        Books book = new Books("Gone with the Wind");
//        assertEquals("Gone with the Wind", book.getTitle());
//    }

    @Test
    void getPageNum() {
        Books book = new Books("Nineteen Eighty Four", 328, 1949);
        assertEquals(328, book.getPageNum());
    }

    @Test
    void getPubYear() {
        Books book = new Books("To Kill a MockingBird", 281, 1960);
        assertEquals(1960, book.getPubYear());
    }
}