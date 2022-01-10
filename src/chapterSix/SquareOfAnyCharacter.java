package chapterSix;

import java.util.Scanner;

public class SquareOfAnyCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of solid square");
        int length = scanner.nextInt();
        System.out.println("Enter the character fill ");
        char fill = scanner.next().charAt(0);
        System.out.print(squareOfAsterisks(length, fill));

    }

    static int squareOfAsterisks(int length,char fillCharacter ){
        for (int i = 1; i <= length; i++){
            for (int j = 1; j<= length; j++)
                System.out.print(fillCharacter + " ");
            System.out.println();
        }
        return length;
    }
}
