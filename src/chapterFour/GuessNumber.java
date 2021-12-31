package chapterFour;

//the program chooses the random number, from 1 to 1000
//tell user to input or guess the number
//if the guess is higher, give feedback that it is higher and tell user to try again
//prompt user for next guess
//if guess is correct , display congratulations
//allow user to choose to play again

import java.util.Scanner;
public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       double randomNumber = Math.random() * 1000;
        System.out.println(randomNumber);

                for (int count = 1; count <= 1000; count++) {
                    System.out.println("Guess  the number: ");
                    int guessNumber = input.nextInt();
                    if (guessNumber > randomNumber) {
                        System.out.printf("%d is higher, try again\n", guessNumber);
                        if (guessNumber < randomNumber)
                            System.out.printf("%d is lower, try again\n", guessNumber);
                        if (guessNumber == randomNumber) {
                            System.out.println("Congratulations, YOU ARE RIGHT!");

                        }
                    }

            }

    }
}
