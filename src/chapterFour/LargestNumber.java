package chapterFour;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;

        for (int counter = 1; counter <= 10; counter++){
            System.out.println("Enter ten integers: ");
            int number = scanner.nextInt();
            System.out.println(counter);
            if (number > largest)
            largest = number;
            System.out.println("The largest number found so far is: " + largest);
        }

    }
}
