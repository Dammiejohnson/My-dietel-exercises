package chapterFour;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;
public class StudentGradeSentinel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter any Grade and enter -42 to quit:");
        int grade = input.nextInt();

        int gradeCount = 0;
        int total = 0;
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;

        while (grade != -42) {
            total += grade;

            gradeCount++;

            System.out.println("Enter any Grade and enter -42 to quit:");
            grade = input.nextInt();

            if (grade == -42)
                break;

            if (grade < minimum)
                minimum = grade;

            if (grade > maximum)
                maximum = grade;
        }


        System.out.printf("The total grade is: %d%n", total);
        System.out.printf("The minimum grade is: %d%n", minimum);
        System.out.printf("The maximum grade is: %d%n", maximum);

        double average = (double) total / gradeCount;
        System.out.printf("The average grade is: %.2f%n", average);
    }

}
