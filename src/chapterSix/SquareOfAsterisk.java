package chapterSix;

import java.util.Scanner;

public class SquareOfAsterisk {
    public static void main(String[] args) {
        System.out.print(squareOfAsterisks());

    }

    static int squareOfAsterisks(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of solid square");
        int length = scanner.nextInt();
        for (int i = 1; i <= length; i++){
            for (int j = 1; j<= length; j++)
                System.out.print("* ");
            System.out.println();
        }
        return length;
    }
}
