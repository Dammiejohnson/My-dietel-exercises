package chapterFour;

import java.util.Scanner;
public class FactorMethod {
    public static void main(String[] args) {
       factors();
       getEvenNumbers(10);
    }
        public static void factors(){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number to check for: ");
            int userInput = input.nextInt();

            int result = calculateFactorOf(userInput);


            if (result <= 2) System.out.printf("%d is a prime number%n", userInput);
            else System.out.printf("%d is not a prime number%n", userInput);

            getEvenNumbers(userInput);

        }
        public static int calculateFactorOf(int userInput) {
            int factors = 0;
            for (int number = 1; number <=userInput; number++) if (userInput % number == 0) factors++;
            return factors;
        }

        public static void getEvenNumbers(int evenNumber) {
            if (evenNumber % 2 == 0) System.out.printf("%d is an even number%n", evenNumber);
            else System.out.printf("%d is not an even number%n", evenNumber);
        }

}
