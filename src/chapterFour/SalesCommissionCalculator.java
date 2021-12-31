package chapterFour;

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SalesCommission salesPerson = new SalesCommission();
        int item = 0;
        double total = 0.0;
        int counter = 0;

        while (item != -1) {

            System.out.println("Enter the item sold");
            item = scanner.nextInt();
            salesPerson.setItem(item);
            salesPerson.setGrossSale(item);

            if (item != -1) {
                System.out.println("The value of the item sold is: " + salesPerson.getItem());
                System.out.println("Your earning on the item sold is: " + salesPerson.getEarning());

                System.out.println();
                counter++;
            }

            System.out.println(counter);
            total += salesPerson.getEarning();

        }
        System.out.println(total + 200);

    }
}
