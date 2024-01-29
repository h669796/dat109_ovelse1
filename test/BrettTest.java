import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BrettTest {

    private Brett brett;

    @BeforeEach
    public void setUp(){
        brett = new Brett();
    }

    @Test

    public void testGetStartRute(){
        Rute startRute = brett.getStartRute();
        assertEquals(0, startRute.getIndex());
    }

    @Test
    public void TestRuteUtenSlangeEllerStige(){
        int squarenumber = 5;
        int result = brett.checkSquare(squarenumber);
        assertEquals(squarenumber, result);
    }

    @Test
    public void testRuteMedStige(){
        int rutenr = 3;
        int forventetResultat = 22;
        int resultat = brett.checkSquare(rutenr);
        assertEquals(forventetResultat, resultat);
    }

    @Test
    public void TestRutemedSLange(){
        int squarenr = 90;
        int ankommetrute = 76;
        int resultat = brett.checkSquare(squarenr);
        assertEquals(ankommetrute, resultat);
    }




}
