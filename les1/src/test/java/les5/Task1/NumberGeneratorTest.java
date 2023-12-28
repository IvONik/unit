package les5.Task1;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberGeneratorTest {

    @Test
    void generateRandomNumbers() {
        NumberGenerator numberGenerator = new NumberGenerator();
        List<Integer> numbers = numberGenerator.generateRandomNumbers(5, 0, 10);
        assertEquals(5, numbers.size());
        assertTrue(0 <= Collections.min(numbers));
        assertTrue(10 >= Collections.max(numbers));
    }
}