package Lecture4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        int[] numbers = new int[15];
        Random randomVariable = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = randomVariable.nextInt(1000) + 1;;
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        Statistics_task3 statistics = new Statistics_task3();

        statistics.minValue(numbers);
        statistics.maxValue(numbers);
        statistics.avgValue(numbers);

    }
}
