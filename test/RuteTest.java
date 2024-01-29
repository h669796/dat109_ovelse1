import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RuteTest {

    @Test
    public void testGetIndex() {
        int index = 5;
        Rute rute = new Rute(index);
        assertEquals(index, rute.getIndex());
    }



}
