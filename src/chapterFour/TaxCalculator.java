package chapterFour;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tax citizen = new Tax();
        int counter = 1;

        while (counter<=3) {

            System.out.println("Enter your name");
            String nameOfCitizen = scanner.nextLine();
            citizen.setName(nameOfCitizen);

            System.out.println("Enter the amount of your earning");
            double earning = scanner.nextDouble();
            citizen.setEarning(earning);
            citizen.setTotalTax(earning);
            scanner.nextLine();

            System.out.println("The total tax for "+ citizen.getName() + " is " + citizen.getTotalTax());
            counter++;
        }
    }
}
