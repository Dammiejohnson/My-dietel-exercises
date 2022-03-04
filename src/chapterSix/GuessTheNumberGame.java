package chapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessTheNumberGame {
    Scanner scanner = new Scanner(System.in);
    SecureRandom numberGeneration = new SecureRandom();

    public static void main(String[] args) {
    GuessTheNumberGame game = new GuessTheNumberGame();
    game.numberGame();
    }

    public void numberGame() {
        int number = 1 + numberGeneration.nextInt(1000);
//        System.out.println(number);
        System.out.println("Welcome to the guess number game, press 1 to play and 0 to exit:\n");
        int input = scanner.nextInt();
        if (input == 0){
            System.exit(0);
        }else if(input == 1){
            System.out.println("Guess a number between 1 and 1000, Press 0 to exit : ");
            int guess = scanner.nextInt();
            checkRandomNumber(guess, number);
        }
    }


    private void checkRandomNumber(int guess, int number) {
        while (guess != number && guess != 0){
            if (guess > number) {
                System.out.println("Too high, try again");
            }
            if (guess < number) {
                System.out.println("Too low, try again");
            }
            System.out.println("Guess a number between 1 and 1000, Press 0 to exit : ");
            guess = scanner.nextInt();

        }
        while (guess == number && guess != 0) {
            System.out.println("Congratulations!!! You guessed the number and press 0 to exit!");
            number = 1 + numberGeneration.nextInt(1000);
//            System.out.println(number);
            System.out.println("Guess a number between 1 and 1000, Press 0 to exit : ");
            guess = scanner.nextInt();
            checkRandomNumber(guess, number);
        }

    }
}



