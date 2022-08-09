package lecture4;

public class ArrayMin {

    public static void main(String[] args) {

        int[] numbers = {7,85,12,3,88};
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Min = " + min);
    }
}
