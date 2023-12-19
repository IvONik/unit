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
        assertTrue(main.evenOddNumber(0),"Число должно быть четным");
        assertFalse(main.evenOddNumber(7), "Число должно быть нечетным");
    }

    @Test
    void numberInInterval() {
        Main main = new Main();
        assertTrue(main.numberInInterval(26), "число должно входить в интервал");
        assertFalse(main.numberInInterval(5), "число не должно входить в интервал");
    }
}