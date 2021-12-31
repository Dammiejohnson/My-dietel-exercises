package chapterSix;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int minimum = 0;
        int maximum = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter number: ");
            int num = input.nextInt();

            minimum = Math.min(num, minimum);
            maximum = Math.max(num, maximum);
        }
        System.out.println(minimum);
        System.out.println(maximum);
    }
}
