package chapterSix;

import java.util.Scanner;

public class JunoAcRemote {

    public static JunoAc myAc;

    public static void main(String[] args) {
        initialprompt();
    }
    public static void initialprompt() {
        String prompt = """
                Welcome to JunoAc
                Press 1 to turnON
                Press 2 to turnOff
                 """;
        System.out.println(prompt);
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();

        if (userInput == 1){

        }

    }
}
