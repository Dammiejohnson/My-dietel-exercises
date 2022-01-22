package chapterFour;

import java.util.Scanner;

public class GuessNumberApp {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 100);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the guess number game!!!!!! \n Press 1 to   play again and 0 to stop");
        int guess = 0;

        while (true) {

            do {
                System.out.println("Guess a number between 1 and 100");
                guess = scanner.nextInt();
                if (number > guess) {
                    System.out.println("Your Guess is Low!");
                } else if (number < guess) {
                    System.out.println("Your Guess is High!");
                } else {
                    System.out.println("Congratulations, You are Correct!!");
                }
            }
            while (number != guess);
            System.out.println(number);

            System.exit(0);
        }
    }
}
