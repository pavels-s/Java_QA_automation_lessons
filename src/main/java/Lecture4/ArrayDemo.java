package Lecture4;

import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {

    arrayMethod();
    arrayMethod2();
    }

    public static void arrayMethod() {
        int[] leapYear = new int[3];
        leapYear[0] = 1;
        leapYear[1] = 2;
        leapYear[2] = 5;
        System.out.println(Arrays.toString(leapYear));
    }

    public static void arrayMethod2(){
        int[] leapYear = {3,7,90};
        System.out.println(Arrays.toString(leapYear));
    }
}
