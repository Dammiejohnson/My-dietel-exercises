package chapterSix;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a four digit number");
        int number = scanner.nextInt();
        System.out.printf("The sum of the four digit is %d", sumOfFourNumbers(number));

    }
    static int sumOfFourNumbers(int digit) {
        int total = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        if (String.valueOf(digit).length() == 4) {
            a = digit / 1000;
            b = (digit % 1000) / 100;
            c = (digit % 100) / 10;
            d = (digit % 10);
        }
        total += a + b + c + d;
        return total;
    }
}
