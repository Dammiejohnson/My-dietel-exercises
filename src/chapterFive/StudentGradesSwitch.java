package chapterFive;

import java.util.Scanner;

public class StudentGradesSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String studentName = "";
        String studentGrade = "";
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int eCount = 0;

        for (int i = 1; i <= 5; i++){
            System.out.println("Enter your name");
            studentName = scanner.nextLine();
            System.out.println("Enter your grade");
            studentGrade = scanner.nextLine();

            switch (studentGrade) {
                case "A" -> aCount++;
                case "B" -> bCount++;
                case "C" -> cCount++;
                case "D" -> dCount++;
                case "E" -> eCount++;
                default -> {
                }
            }

        }
        System.out.println("The total number of students with grade A is/are: " + aCount);
        System.out.println("The total number of students with grade B is/are: " + bCount);
        System.out.println("The total number of students with grade C is/are: " + cCount);
        System.out.println("The total number of students with grade D is/are: " + dCount);
        System.out.println("The total number of students with grade E is/are: " + eCount);



    }
}
