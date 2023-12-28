package HW6;

import les5.Task1.NumberGenerator;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListServiceTest {
    @Test
    void generateRandomNumbers() {
        ListService listService = new ListService();
        List<Integer> numbers = listService.generateRandomNumbers(5, 0, 10);

        assertEquals(5, numbers.size());
        assertTrue(0 <= Collections.min(numbers));
        assertTrue(10 >= Collections.max(numbers));
    }
    @Test
    void calculateAverage(){
        List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 2, 3, 4));
        ListClass listClass = new ListClass(numbers);
        listClass.setNumbers(numbers);
        ListService listService = new ListService();
        double average = listService.calculateAverage(listClass.getNumbers());
        assertTrue(0 < numbers.size() );
        assertEquals(3, average);
    }
    @Test
    void comparisonAverageOfLists(){
        double average1 = 5;
        double average2 = 4;
        ListService listService1 = new ListService();
        int result1 = listService1.comparisonAverageOfLists(average1,average2);
        assertEquals(1, result1);

        double average3 = 5;
        double average4 = 6;
        ListService listService2 = new ListService();
        int result2 = listService2.comparisonAverageOfLists(average3,average4);
        assertEquals(2, result2);

        double average5 = 5;
        double average6 = 5;
        ListService listService3 = new ListService();
        int result3 = listService3.comparisonAverageOfLists(average5,average6);
        assertEquals(3, result3);
    }
}