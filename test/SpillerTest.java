import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SpillerTest {

    private Brett brett;
    private Spiller spiller;

    @Before
    public void setUp() {
        brett = new Brett();
        spiller = new Spiller("TestPlayer", brett);
    }

    @Test
    public void testGetNavn() {
        assertEquals("TestPlayer", spiller.getNavn());
    }

    @Test
    public void testTrengerSekser() {
        assertFalse(spiller.trengerSekser());
        spiller.setTrengerSekser(true);
        assertTrue(spiller.trengerSekser());
    }

    @Test
    public void testRollDice() {
        // Mocking Terning class for testing
        Terning mockTerning = new Terning() {
            @Override
            public void trill() {
                // Simulate a dice roll
                setVerdi(6);
            }
        };

        int totalRoll = spiller.rollDice(mockTerning);
        assertEquals(6, totalRoll);
    }

    @Test
    public void testMovePlayer() {
        // Assuming the player starts at the beginning of the board
        assertEquals(0, spiller.brikke.getRute().getIndex());

        // Move player 5 steps
        spiller.movePlayer(5);
        assertEquals(5, spiller.brikke.getRute().getIndex());

        // Move player to the end of the board
        spiller.movePlayer(95);
        assertEquals(99, spiller.brikke.getRute().getIndex());

        // Trying to move beyond the end of the board should not change the player's position
        spiller.movePlayer(2);
        assertEquals(99, spiller.brikke.getRute().getIndex());
    }

    @Test
    public void testSpillTrekk() {
        // Mocking Terning class for testing
        Terning mockTerning = new Terning() {
            private int callCount = 0;
            private final int[] rolls = {2, 4, 6}; // Simulate rolls of 2, 4, and 6
            @Override
            public void trill() {
                if (callCount < rolls.length) {
                    setVerdi(rolls[callCount]);
                    callCount++;
                }
            }
        };

        // Capture the console output for testing
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Simulate three rolls and check the console output
        spiller.spillTrekk(mockTerning);
        assertEquals("TestPlayer triller: 2\nTestPlayer beveger seg til rute 2\n", outContent.toString());

        // Reset System.out to its original PrintStream
        System.setOut(System.out);
    }

    @Test
    public void testHarVunnet() {
        // Move the player to the last square on the board
        spiller.movePlayer(99);
        assertTrue(spiller.harVunnet());

        // Move the player one step back, should not win
        spiller.movePlayer(-1);
        assertFalse(spiller.harVunnet());
    }



}
