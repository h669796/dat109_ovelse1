import org.junit.Before;
import org.junit.Test;
import java.io.PrintStream;

import java.io.ByteArrayOutputStream;

import static org.junit.Assert.*;

public class StigespillTest {

    private Stigespill stigespill;

    @Before
    public void setUp() {
        stigespill = new Stigespill(2); // Adjust the number of players as needed
    }

    @Test
    public void testConstructor() {
        assertNotNull(stigespill);
        assertEquals(3, stigespill.getAntallSpillere()); // Including the default player
    }

    @Test
    public void testSpill() {
        // Mocking Spiller class for testing
        Spiller mockSpiller = new Spiller("MockPlayer", new Brett()) {
            @Override
            public void spillTrekk(Terning terning) {
                // Do nothing in the mock implementation
            }

            @Override
            public boolean harVunnet() {
                // Always return true to simulate winning
                return true;
            }
        };

        // Replace one of the players in the game with the mock player
        stigespill.getSpillere().set(1, mockSpiller);

        // Capture the console output for testing
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Run the game and check the console output
        stigespill.spill();
        assertEquals("MockPlayer har vunnet stigespillet!\n", outContent.toString());

        // Reset System.out to its original PrintStream
        System.setOut(System.out);
    }

    // Add more test cases as needed

}
