package Lecture2;

public class Calculator {

    public static void sum(int a, int b) {
        int result = a + b;
        System.out.println(a + " + " + b + " = " + result);
    }

    public static void sub(int a, int b) {
        int result = a - b;
        System.out.println(a + " - " + b + " = " + result);
    }

    public static void mult(int a, int b) {
        int result = a * b;
        System.out.println(a + " * " + b + " = " + result);
    }

    public static void div(int a, int b) {
        double result = (double) a / b;
        System.out.println(a + " / " + b + " = " + result);
    }


    public static void main(String[] args) {

        sum(8, 6);
        sub(7, 3);
        mult(14, 376);
        div(75, 10);


    }
}
