package chapterFour;

import java.util.Scanner;

public class TwoLargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int counter = 1; counter <= 10; counter++){
            System.out.println("Enter ten integers: ");
            int number = scanner.nextInt();
            System.out.println(counter);
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            }
            else if (number > secondLargest)
                secondLargest = number;
            System.out.println("The largest number found so far is: " + largest);
            System.out.println("The second largest number found so far is: " + secondLargest);
        }

    }
}
