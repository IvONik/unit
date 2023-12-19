package HW3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void evenOddNumber() {
        Main main = new Main();
        assertTrue(main.evenOddNumber(0));
        assertFalse(main.evenOddNumber(7));
    }

    @Test
    void numberInInterval() {
        Main main = new Main();
        assertTrue(main.numberInInterval(26));
        assertFalse(main.numberInInterval(6));
    }
}