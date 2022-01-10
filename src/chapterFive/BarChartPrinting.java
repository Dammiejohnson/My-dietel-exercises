package chapterFive;

import java.util.Scanner;

public class BarChartPrinting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number between 1 and 30");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int num3 = scanner.nextInt();
            int num4 = scanner.nextInt();
            int num5 = scanner.nextInt();

            for (int i = 1; i <= num1; i++) {
                if (num1 > 0 && num1 <= 30 )
                    System.out.print("* ");
                else {
                    System.out.print("  ");
                }
                }
                System.out.println();
                for (int i = 1; i <= num2; i++) {
                    if (num2 > 0 && num2 <= 30 )
                    System.out.print("* ");
                }
                System.out.println();
                for (int i = 1; i <= num3; i++) {
                    if (num3 > 0 && num3 <= 30 )
                    System.out.print("* ");
                }
                System.out.println();
                for (int i = 1; i <= num4; i++) {
                    if (num4 > 0 && num4 <= 30 )
                    System.out.print("* ");
                }
                System.out.println();
                for (int i = 1; i <= num5; i++) {
                    if (num5 > 0 && num5 <= 30 )
                    System.out.print("* ");
                }
    }
}
