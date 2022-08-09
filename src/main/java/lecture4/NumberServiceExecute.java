package lecture4;

import java.util.Scanner;

public class NumberServiceExecute {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        NumberService numberService = new NumberService();

        int start, finish;

        System.out.print("Enter first number : ");
        start = in.nextInt();

        System.out.print("Enter second number : ");
        finish = in.nextInt();

        System.out.println("Sum = " + numberService.rangeSum(start, finish));
        System.out.println("Even Sum = " + numberService.rangeEvenCount(start, finish));
    }
}
