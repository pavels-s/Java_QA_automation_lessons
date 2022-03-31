package Lecture2;

import java.util.Random;

public class Exercise1 {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 4;
//        double ans = a/b;
//        System.out.println(ans);

        Random randomVariable = new Random();
        int a = randomVariable.nextInt(101);
        int b = randomVariable.nextInt(101);
        int c = randomVariable.nextInt(101);
        int sum = a+b+c;
        System.out.println("a=" + a +" b=" + b + " c=" + c + " sum=" + sum);

    }
}
