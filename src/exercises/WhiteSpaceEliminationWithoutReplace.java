package exercises;

import java.util.Scanner;

public class WhiteSpaceEliminationWithoutReplace {
    public static void main(String[] args) {
        removeWhiteSpace();

    }

    private static void removeWhiteSpace(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence or word with white spaces");
        String input = scanner.nextLine().trim();

        for (Character letter : input.toCharArray()){
            if(!Character.isWhitespace(letter)){
                System.out.print(letter);
            }
        }
    }
}
