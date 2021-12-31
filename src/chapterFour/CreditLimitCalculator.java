package chapterFour;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        CreditLimit user = new CreditLimit(12345, 4000);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your account number");
        int accNum = scanner.nextInt();
        user.setAccountNumber(accNum);
        System.out.println("Your account number is: " + user.getAccountNumber());

        //System.out.println("Your initial balance is: " + user.getInitialBalance());

        System.out.println("Enter the total charges for the month");
        int charges = scanner.nextInt();
        user.setTotalCharges(charges);
        System.out.println("Your total charges for the month is: " + user.getTotalCharges());

        System.out.println("Enter the total credits for the month");
        int credits = scanner.nextInt();
        user.setTotalCredits(credits);
        System.out.println("Your total credits for the month is: " + user.getTotalCredits());

        System.out.println("Your balance is: " + user.getNewBalance());



    }
}
