package lecture4;

public class Statistics_task3 {

    public void maxValue(int[] numbers){
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Max = " + max);
    }

    public void minValue(int[] numbers) {
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Min = " + min);
    }

    public void avgValue(int[] numbers) {
        double sum = 0;
        double average;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        average = sum / numbers.length;
        System.out.println("Average = " + average);
    }
}
