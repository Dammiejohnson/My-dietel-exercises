package exercises;

import java.util.Scanner;

public class PalindromeWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        StringBuilder reverseWord = new StringBuilder(word);
        if (reverseWord.reverse().toString().equals(word)) System.out.println(word + " is a palindrome");
        else System.out.println(word + " is not a palindrome");
    }
}
