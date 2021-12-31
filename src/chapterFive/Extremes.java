package chapterFive;

import java.util.Scanner;

public class Extremes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        int total = 0;

        System.out.println("How many integers do you want to compare");
        int numbersToCompare = scanner.nextInt();

        for (int counter = 1; counter <= numbersToCompare; counter++){
            System.out.println("Enter an integer:");
            int number = scanner.nextInt();

            if (number < minimum) {
                minimum = number;
            }
            if (number > maximum){
                    maximum = number;
                }
        }
        System.out.println("The maximum of the numbers is: " + maximum);
        System.out.println("The minimum of the numbers is: " + minimum);

        total = maximum + minimum;
        System.out.println("The total of " + minimum + " and " + maximum + " is " + total);
    }
}
