package Lecture4;

import java.util.Random;

public class ArrayService {

        public int[] create(int size) {
            int[] newArray = new int[size];
            return newArray;
        }


        public void fillRandomly(int[] array) {
            Random random = new Random();

            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(101);
            }
        }


        public void printArray(int[] array) {
            printArray(array);
        }


        public int sum(int[] array) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            return sum;
        }


        public double avg(int[] array) {
            double sum = 0, result;

            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }

            if (sum == 0) {
                result = 0;
            } else {
                result = sum / array.length;
            }
            return result;
        }
}
