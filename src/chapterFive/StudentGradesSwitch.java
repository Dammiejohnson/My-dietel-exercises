package chapterFive;


//(Student Grades) A group of five students earned the following grades: Student 1, ‘A’; stu-
//        dent 2, C’; student 3, ‘B’; student 4, ‘A’ and student 5, ‘B’. Write an application that reads a series
//        of pairs of numbers as follows:
//        a) student name
//        b) student letter grade
//        Your program should use a switch statement to determine how many students got a grade of ‘A’,
//        how many got a grade of ‘B’, how many got a grade of ‘C’, and how many got a grade of ‘D’. Use a
//        loop as needed to input the five student grades, and then finally display the results.
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

            switch (studentGrade){
                case "A":
                    aCount++;
                    break;
                case "B":
                    bCount++;
                    break;
                case "C":
                    cCount++;
                    break;
                case "D":
                    dCount++;
                    break;
                case"E":
                    eCount++;
                    break;
                default:

            }

        }
        System.out.println("The total number of students with grade A is/are: " + aCount);
        System.out.println("The total number of students with grade B is/are: " + bCount);
        System.out.println("The total number of students with grade C is/are: " + cCount);
        System.out.println("The total number of students with grade D is/are: " + dCount);
        System.out.println("The total number of students with grade E is/are: " + eCount);



    }
}
