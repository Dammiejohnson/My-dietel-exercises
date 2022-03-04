package ChapterTwo;

import java.util.Scanner;

public class MinutesConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your time in minutes: ");
        int timeInMinutes = scanner.nextInt();
        int timeInYear = 60 * 24 * 365;
        int timeInDay = 60 * 24;


         int yearConversion = timeInMinutes / timeInYear;
         int dayConversion =  (timeInMinutes % timeInYear) / timeInDay;

        System.out.println("The conversion  of " +  timeInMinutes + " to years and days is "+ yearConversion + " years and " + dayConversion + " days\n");

    }
}
