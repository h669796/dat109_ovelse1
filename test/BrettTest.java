import javax.annotation.processing.SupportedAnnotationTypes;
import static org.junit.Assert.assertEquals;

public class BrettTest {

    private Brett brett;

    @Before
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
        int resultat = brett.checkSquare(rutenr);
        assertEquals(rutenr, resultat;
    }

    @Test
    public void TestRutemedSLange(){
        int squarenr = 90;
        int ankommetrute = 76;
        int resultat = brett.checkSquare(squarenr);
        assertEquals(ankommetrute, resultat);
    }










}
