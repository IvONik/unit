package les5.Task1;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IntegrationTest {

    @Test
    void generateFindMax (){
        NumberGenerator numberGenerator = new NumberGenerator();
        MaxNumberFinder maxNumberFinder = new MaxNumberFinder();
        List<Integer> numbers = numberGenerator.generateRandomNumbers(6, 0, 10);
        int maxNum = maxNumberFinder.findMaxNumber(numbers);
        assertTrue(maxNum >=0 &&  maxNum <= 10);
    }

}
