package chapterFour;

import java.util.Scanner;

public class SentinelValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int sum = 0;

        System.out.println("ENTER A NUMBER: ");
        number = scanner.nextInt();

        while (number != -1) {
            sum += number;

            System.out.println("ENTER A NUMBER: ");
            number = scanner.nextInt();
        }
        System.out.println("Sum of the numbers is " + sum);
    }
}
