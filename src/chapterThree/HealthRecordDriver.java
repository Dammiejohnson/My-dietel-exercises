package chapterThree;

import java.util.Scanner;

public class HealthRecordDriver {
    public static void main(String[] args) {
        HealthRecords healthRecords = new HealthRecords("DAMI", "SANNI", "Male",4,4, 1920, 77, 110.40);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter patient's first name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter patient's last name:");
        String lastName = scanner.nextLine();
        System.out.println("Enter patient's gender:");
        String gender = scanner.nextLine();
        System.out.println("Enter day of birth:");
        int day = scanner.nextInt();
        System.out.println("Enter month of birth:");
        int month = scanner.nextInt();
        System.out.println("Enter year of birth:");
        int year = scanner.nextInt();
        System.out.println("Enter height in inches:");
        double height = scanner.nextDouble();
        System.out.println("Enter weight in pounds:");
        double weight = scanner.nextInt();

        healthRecords.setFirstName(firstName);
        healthRecords.setLastName(lastName);
        healthRecords.setDayOfBirth(year, month, day);
        healthRecords.setGender(gender);
        healthRecords.setHeight(height);
        healthRecords.setWeightInPound(weight);

        String dob = healthRecords.getDayOfBirth().toString();

        System.out.println("Patient's name "+ healthRecords.getFirstName()+ " " + healthRecords.getLastName());
        System.out.printf("Patient's gender is %s%n",healthRecords.getGender());
        System.out.println("Day of birth is " + dob);
        System.out.printf("Patient's height is %.2f%s%n", healthRecords.getHeight(), "inches") ;
        System.out.printf("Patient's weight in pound is %.2f%s%n", healthRecords.getWeightInPound(), "pound");
        System.out.printf("Present age is %d%n", healthRecords.getAgeInYears());
        System.out.printf("Maximum heart rate is %d%n", healthRecords.calculateMaximumHeartRate());
        System.out.printf("Target heart rate is %s%n", healthRecords.getTargetHeartRate());
        System.out.printf("BMI is %.3f%n", healthRecords.getBodyMassIndex());
    }
}
