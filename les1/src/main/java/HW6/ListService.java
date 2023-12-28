package HW6;

import les2.task4.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListService {
    private List<ListClass> numbers;

    public ListService() {
        numbers = new ArrayList<>();
    }
    public List<Integer> generateRandomNumbers(int count, int minValue, int maxValue) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            int randomNumber = random.nextInt(maxValue - minValue + 1) + minValue;
            numbers.add(randomNumber);
        }
        return numbers;
    }

    public double calculateAverage(List <Integer> numbers) {
        Integer sum = 0;
        if(!numbers.isEmpty()) {
            for (Integer num : numbers) {
                sum += num;
            }
            double average = sum / numbers.size();
            return average;
        }
        return sum;
    }

    public int comparisonAverageOfLists( double average1, double average2){
        if (average1 > average2){
            System.out.println("Первый список имеет большее среднее значение");
            return 1;
        }if (average1 < average2){
            System.out.println("Второй список имеет большее среднее значение");
            return 2;
        }else{
            System.out.println("Средние значения равны");
            return 3;
        }
    }
}
