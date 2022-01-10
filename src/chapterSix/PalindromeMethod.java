package chapterSix;

import java.util.Scanner;

public class PalindromeMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer that has two to five digits ");
        int digit = scanner.nextInt();
        System.out.println(isPalindromeForTwoNumbers(digit) || isPalindromeForThreeNumbers(digit) || isPalindromeForFourNumbers(digit) || isPalindromeForFiveNumbers(digit));

    }

    static boolean isPalindromeForTwoNumbers(int digit) {
        if (String.valueOf(digit).length() == 2) {
            int a = digit / 10;
            int b = (digit % 10);

            if (a == b) {
                System.out.printf("%d is a palindrome of 2 numbers\n", digit);
                return true;
            } else {
                System.out.printf("%d is not a palindrome of 2 numbers\n", digit);
                return false;
            }
        }
        return false;
    }

    static boolean isPalindromeForThreeNumbers(int digit) {
        if (String.valueOf(digit).length() == 3) {
            int a = digit / 100;
            //int b = (digit % 100) / 10;
            int c = (digit % 10);

            if (a == c){
                System.out.printf("%d is a palindrome of three numbers\n", digit);
               return true;
            } else{
                System.out.printf("%d is not a palindrome of three numbers\n", digit);
                return  false;
            }
        }

        return false;
    }

    static boolean isPalindromeForFourNumbers(int digit) {
        if (String.valueOf(digit).length() == 4) {
            int a = digit / 1000;
            int b = (digit % 1000) / 100;
            int c = (digit % 100) / 10;
            int d = (digit % 10);

            if (a == d && b == c){
                System.out.printf("%d is a palindrome of four numbers\n", digit);
                return true;
            } else {
                System.out.printf("%d is not a palindrome of four numbers\n", digit);
                return false;
            }
        }
        return false;
    }

    static boolean isPalindromeForFiveNumbers(int digit) {
        if(String.valueOf(digit).length() == 5) {
            int a = digit / 10000;
            int b = (digit % 10000) / 1000;
            //int c = (digit % 1000) / 100;
            int d = (digit % 100) / 10;
            int e = (digit % 10);

            if (a == e && b == d) {
                System.out.printf("%d is a palindrome of five numbers\n", digit);
                return true;

            } else {
                System.out.printf("%d is not a palindrome of five numbers\n", digit);
                return false;
            }

        }
        return false;
    }
}
