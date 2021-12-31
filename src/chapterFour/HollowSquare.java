package chapterFour;

import java.util.Scanner;

public class HollowSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the hollow square:\n");
        int length = scanner.nextInt();
        for (int row = 1; row<= length; row++){
            for (int column = 1; column <= length; column++) {
                //use the index of the squares to vuild the hollow parts
                if (row == 1 || row == length || column == 1 || column == length) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
