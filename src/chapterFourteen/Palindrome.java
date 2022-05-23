package chapterFourteen;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        print("Enter any word to check if it is a palindrome or not:");
        String input = scanner.next();
        isPalindrome(input);
    }

    private static void isPalindrome(String input) {
        StringBuilder reverseInput = new StringBuilder();

        for (int i = input.length()-1; i > -1; i--) {
            reverseInput.append(input.charAt(i));
        }
        if (reverseInput.toString().equalsIgnoreCase(input)){
            print( input + " is a palindrome");
        }
        else {
            print( input + " is  not a palindrome");
        }
    }

    private static void print(String message){
        System.out.println(message);
    }
}
