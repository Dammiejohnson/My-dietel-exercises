package chapterFour;

import java.util.Scanner;

public class SubtractionQuiz {
    public static void main(String[] args) {
        final int numberOfQuestions = 5;
        int pass= 0;
        int  count = 0;
        long startTime = System.currentTimeMillis();
        String output = " ";
        Scanner input = new Scanner(System.in);

        while (count < numberOfQuestions) {
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);
            int difference = number1 - number2;

            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }
            System.out.printf("the difference between %d and %d is ?%n", number1, number2);
            int result = input.nextInt();

            if (number1 - number2 == result) {
                System.out.println("You are correct!");
                pass++;
            } else {
                System.out.printf("You are incorrect, the difference between %d and %d is %d%n", number1, number2, difference);
            }
            count++;

            output += "\n" + number1 + "-" + number2 + "=" + result +
                    ((number1 - number2 == result) ? " correct" : " wrong");
        }
        long endTime = System.currentTimeMillis();
        long testDuration = endTime - startTime;

        System.out.println("Pass is " + pass +
                "\nTest time is " + testDuration / 1000 + " seconds\n" + output);
    }
}
