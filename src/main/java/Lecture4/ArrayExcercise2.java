package Lecture4;

public class ArrayExcercise2 {

    public static void main(String[] args) {

        int[] numbers = {1,17,86,4,-7};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++){
            sum = sum + numbers[i];
        }

        System.out.println(sum);
    }
}
