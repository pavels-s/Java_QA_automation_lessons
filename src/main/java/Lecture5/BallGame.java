package Lecture5;

import java.util.Scanner;

public class BallGame {

    public static void main(String[] args) {

        int[] board = {0, 0, 1};
//        hide ball  on board

        System.out.println("Please enter number from 1-3 ");
//        try until person enter 1-3

        Scanner in = new Scanner(System.in);
        int personGuess = in.nextInt();


        if ((personGuess < 1) || (personGuess > 3) ) {
            System.out.println("Wrong number!");
        } else {
            if (board[personGuess - 1] == 1) {
                System.out.println("You win!");
            }

            if (board[personGuess - 1] == 0) {
                System.out.println("You lose!");
            }
        }

        //        Computer show the answer = where was the ball
//        if person guessed - write You have won else you lose!!
    }
}

