package chapterSix;

import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer  between 1 and 1000 to  check if its a perfect number");
        int number = scanner.nextInt();
        System.out.println(isAPerfectNumber(number));

    }

    static boolean isAPerfectNumber(int number) {
        int total = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }

        if (total == number) {
            System.out.printf("%d is a perfect number%n", number);
            return true;
        } else {
            System.out.printf("%d is not  a perfect number%n", number);
            return false;

        }
    }

}