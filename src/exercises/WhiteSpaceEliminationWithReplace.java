package exercises;

import java.util.Scanner;

public class WhiteSpaceEliminationWithReplace {
    public static void main(String[] args) {
    replaceSpace();
    }

    private static void replaceSpace(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence or word with whitw spaces");
        String input = scanner.nextLine().trim();
        String inputWithoutSpaces = input.replace(" ", "");
        System.out.println("Your input without spaces is ---> " + inputWithoutSpaces);
    }
}
