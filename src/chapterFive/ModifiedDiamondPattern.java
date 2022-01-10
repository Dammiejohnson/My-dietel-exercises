package chapterFive;

import java.util.Scanner;

public class ModifiedDiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an odd number between 1 and 19");
        int length = scanner.nextInt();

        for (int i = 1; i <= length-1; i++) {
            for (int j = length; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = length; j >= i; j--) {
                System.out.print("* ");
            }
            for (int j = length - 2; j >= i - 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }


    }

