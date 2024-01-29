import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

public class TerningTest {
    private Terning terning;

    @BeforeEach
    void setUp() {
        terning = new Terning();
    }

    @Test
    void TestInitialValue() {
        assertTrue(terning.getVerdi() >= 1 && terning.getVerdi() <= 6, "Verdien etter trillet terning må vere 1 og 6");
    }
}
