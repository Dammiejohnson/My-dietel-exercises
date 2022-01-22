package chapterSeven;

import java.util.Scanner;

//1.take 10 input from user
//2.the 10 inputs must be between 10 and 100
//3.store the input in an array of 10 elements
//4.save the ainput to an array of 10 elements that must have been initialised to -1  for each
//5.loop through the array of input and if a number is duplicated, the second
//one should still be -1 to indicate that it is empty.
public class DuplicateElimination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};

        for (int counter = 0; counter < array.length; counter++){

            System.out.println("Enter 10 integers between 10 and 100");
            int userInput = scanner.nextInt();
            for (int i = counter; i >=0; i--) {

                if (userInput != array[i]) {
                    array[counter] = userInput;


                } else {
                    array[counter] = -1;
                    break;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }


    }
}
