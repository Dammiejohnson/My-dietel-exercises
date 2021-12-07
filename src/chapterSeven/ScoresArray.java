package chapterSeven;
// collect 10 scores from user
//display the numbers
// determine and dis[play the minimum
// determine and display the maximum
//calculate the total
// calculate the average

import java.util.Scanner;

public class ScoresArray {
    public static void main(String[] args) {
        int [] grades = new int [10];
        Scanner input = new Scanner(System.in);
        int total = 0;
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;
       // int score;
        int counter;
        for (counter = 0; counter < grades.length; counter ++ ) {
            System.out.println("Enter a score: ");
           int score =  input.nextInt();


           grades[counter] = score;

            total += score;
            if (maximum< score)
                maximum= score;
            if (minimum>score)
                minimum= score;

        }
    for (counter = 0; counter < grades.length; counter++) {
        System.out.print(grades[counter] + " ");
    }
        System.out.println();

        double average = (double) total / grades.length;
        System.out.printf("The total of the grades is %d%n", total);
        System.out.printf("The average of the grades is %f%n", average);
        System.out.printf("The minimum of the grades is %d%n", minimum);
        System.out.printf("The maximum of the grades is %d%n", maximum);
    }

}
