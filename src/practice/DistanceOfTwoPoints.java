package practice;

import java.util.Scanner;

public class DistanceOfTwoPoints{
    public static void main(String[] args) {
        double distanceCalculation = getDistanceCalculation();
        System.out.printf("The distance between the points is %.3f", distanceCalculation);
    }

    private static double getDistanceCalculation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the point of x1 and x2");
        double x1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();

        System.out.println("Enter the point of y1 and y2");
        double y1 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double distanceCalculation = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
        return distanceCalculation;
    }
}
