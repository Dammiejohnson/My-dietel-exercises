package chapterSeven;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayOddAndEvenNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> even = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int maximum = Integer.MIN_VALUE;
        int counter = 0;
        int number;

        do {

            System.out.println("Enter any number and -1 to exit");
            number = scanner.nextInt();
            if ( number != -1 && number % 2 == 0){
                even.add(number);
                counter = counter+ 1;

                if (number > maximum)
                    maximum = number;
            }
        }
        while (number != -1);

        System.out.println("The even numbers are: " + counter);
        System.out.println("The maximum number is: " + maximum);
   }

}

