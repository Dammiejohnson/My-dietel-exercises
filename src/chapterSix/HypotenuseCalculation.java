package chapterSix;

import java.util.Scanner;

public class HypotenuseCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of sideA and sideB:");
            double sideA = (int) scanner.nextDouble();
            double sideB = (int) scanner.nextDouble();
            System.out.printf("The length of the hypotenuse of %.2f and %.2f is %.2f\n",
                    sideA, sideB, hypotenuseCalculation(sideA, sideB));

    }

    public static double hypotenuseCalculation(double sideA, double sideB) {
        if ((sideA != 0 || sideA < 0) && (sideB != 0 || sideB < 0)) {
            double hypotenuse = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
            return hypotenuse;
        }
        else
            return  0.0;

    }

}
