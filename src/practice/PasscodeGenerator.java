package practice;

import java.util.Random;

public class PasscodeGenerator {
    public static void main(String[] args) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYUZabcdefghijklmnopqrstuvwzyz1234567890!@#$%&*<>.:";
        StringBuilder passcode = new StringBuilder();
        int length = 12;
        char [] array = new char[length];

        Random rand = new Random();

        for (int i = 0; i < length; i++) {
            array[i] = characters.charAt(rand.nextInt(characters.length()));
        }

        for (char c : array) {
            passcode.append(c);
        }
        System.out.println(passcode);


    }
}
