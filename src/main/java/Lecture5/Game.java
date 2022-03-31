package Lecture5;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int numberToGuess = 0;
        int guess;
        Scanner input = new Scanner(System.in);
        Boolean win = false;

        while(win == false){
            System.out.println("Guess a number between 0 and 2: ");
            guess = input.nextInt();

            if (guess == numberToGuess) {
                win = true;
            } else if (guess == 1) {
                System.out.println("The number you have guessed is bigger");
            } else if (guess == 2) {
                System.out.println("The number you have guessed is smaller");
            }

        }
        System.out.println("You win!");
        System.out.println("The correct number was: " + numberToGuess);
    }

}
