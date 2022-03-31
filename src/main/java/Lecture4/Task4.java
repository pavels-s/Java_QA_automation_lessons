package Lecture4;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double firstNumber, secondNumber, result;
        int userChoice;

        System.out.print("Enter A: ");
        firstNumber = in.nextDouble();

        System.out.print("Enter B: ");
        secondNumber = in.nextDouble();

        System.out.println("Enter action (1-sum, 2-substract, 3-multiply, 4-divide: ");
        userChoice = in.nextInt();

        switch (userChoice) {
            case 1: result = firstNumber + secondNumber;
                System.out.println("Result = " + result);
                break;

            case 2: result = firstNumber - secondNumber;
            System.out.println("Result = " + result);
                break;

            case 3: result = firstNumber * secondNumber;
                System.out.println("Result = " + result);
                break;

            case 4: result = firstNumber / secondNumber;
                System.out.println("Result = " + result);
                break;

            default:
                System.out.println("Wrong choice, try again.");
        }

    }
}
