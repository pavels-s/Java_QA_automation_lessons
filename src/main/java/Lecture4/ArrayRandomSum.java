package Lecture4;

import java.util.Random;

public class ArrayRandomSum {

    public static void main(String[] args) {

        Random random = new Random();
        int variable = random.nextInt(100);
        int sum = variable + variable + variable;

        System.out.println(sum);
    }
}
