import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class BrikkeTest {

    private Brikke brikke;

    @Before
    public void setUp() {
        brikke = new Brikke();
    }

    @Test
    public void testGetRuteInitiallyNull() {
        assertNull(brikke.getRute());
    }

    @Test
    public void testSetAndGetRute() {
        Rute rute = new Rute(10);
        brikke.setRute(rute);
        assertEquals(rute, brikke.getRute());
    }



}
