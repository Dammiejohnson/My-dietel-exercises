package chapterFour;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int gradeCount = 0;
        int grade = 0;
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;
        int total = 0;

        while(gradeCount < 10) {
            System.out.println("Enter Grade: ");
            grade = input.nextInt();
            total = total + grade;

            if(grade < minimum)
                minimum = grade;
            if (grade > maximum)
                maximum = grade;
            gradeCount = gradeCount + 1;
        }

        System.out.printf("The total grade is %d%n", total);

            double average = (double) total / gradeCount;

        System.out.printf("The average grade is %.2f%n", average);
        System.out.printf("The minimum grade is %d%n", minimum);
        System.out.printf("The maximum grade is %d%n", maximum);

        }
    }
