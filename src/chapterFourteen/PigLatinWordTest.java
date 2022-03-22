package chapterFourteen;

import java.util.Scanner;

public class PigLatinWordTest {
    public static void main(String[] args) {
        PigLatin pigLatin = new PigLatin();
        Scanner scanner = new Scanner(System.in);
        String [] sentence = scanner.nextLine().split(" ");
        StringBuilder newString = new StringBuilder();
        for (String word: sentence) {
            newString.append(pigLatin.printLatinWord(word)).append(" ");
        }
        System.out.println(newString);
    }

}
