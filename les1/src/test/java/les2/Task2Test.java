package les2;
// пареметризированные тест ы предполают, что мы хотим протестировать конкретные числа и вставлять методы мы не можем
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class Task2Test {

    @ParameterizedTest
    @CsvSource({"5, 3, 8", "10, 4, 6", "6, 7, 42"}) // массив разбивается на подмассивы, где сумма первых двух элементов равно третьему числу
    void testAddition(int a, int b, int expectedResult) {
        assertEquals(expectedResult, a + b, "Incorrect result for " + a + " + " + b);
    }
}