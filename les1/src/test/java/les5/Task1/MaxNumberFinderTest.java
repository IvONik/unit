package les5.Task1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxNumberFinderTest {

    @Test
    void findMaxNumber() {
        MaxNumberFinder maxNumberFinder = new MaxNumberFinder();
        int number = maxNumberFinder.findMaxNumber(List.of(1, 2, 3, 6, 8));
        assertEquals(8, number);
    }
}