package chapterFourteen;

import java.util.Scanner;

public class NumberFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to find factors of the number");
        int number = scanner.nextInt();
        checkFactors(number);
    }

    private static void checkFactors(int number) {
        int noOfFactors = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0){
                noOfFactors++;
            }
        }
        System.out.println(number + " has " + noOfFactors  + " number of factors");


    }
}
