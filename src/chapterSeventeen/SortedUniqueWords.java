package chapterSeventeen;

import java.util.Arrays;
import java.util.Scanner;

public class SortedUniqueWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        displayUniqueWords(sentence);
    }
    private static void displayUniqueWords(String sentence){
        sentence = sentence.toLowerCase();
        Arrays.stream(sentence.split(" ")).distinct().sorted().forEach(System.out::println);
    }
}
