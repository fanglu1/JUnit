import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TvShowTest {

    @Test
    void getTvName() {
        TvShow tvShow = new TvShow("How I Met Your Father");
        assertEquals("How I Met Your Father", tvShow.getTvName());
    }

    @Test
    void getNumOfEpi() {
        TvShow epiNum = new TvShow(10);
        assertEquals(10, epiNum.getNumOfEpi());
    }

    @Test
    void getGenre() {
        TvShow genre = new TvShow("HIMYF", 10, "SitCom");
        assertEquals("SitCom", genre.getGenre());
    }
}