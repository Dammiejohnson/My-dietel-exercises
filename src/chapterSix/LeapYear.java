package chapterSix;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();
        System.out.println(isLeapYear(year));
    }
    static boolean isLeapYear(int year) {
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400  == 0)) {
            System.out.println("It is a leap year");
            return true;
        }
        else{
            System.out.println("It is not a leap year");
            return false;
        }
    }

}
