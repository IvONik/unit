package les1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class TaskTest {
    // любой тест имеет метод void он ничего не принимает и не возвращает.
// аннотация тест защищает от воздействия на код, он абсолютно изолирован
    @Test
    void testEquality() {
        assertEquals(4, 2 + 2);
    }
    // assert- утверждение
    @Test
    void testTrueAndFalse() {
        assertTrue(5 > 3);// если провалится один тест, дальше проверка не пойдет
        assertFalse(2 == 1);
    }
    @Test
    void testNullAndNotNull() {
        String str = null;
        assertNull(str);

        String notNullStr = "Hello";
        assertNotNull(notNullStr);
    }
    @Test
    void testArrayEquality() {
        int[] arr1 = {1, 2, 3}; //если поменять элементы местами, тест провалится
        int[] arr2 = {1, 2, 3};

        assertArrayEquals(arr1, arr2);
    }
}
