package chapterFourteen;

import java.util.Scanner;

public class WordExtractionFromStrings {
    private static int extractWordFrom(String word){
        int count = 0;
        word = word.toLowerCase();
        if(word.length() >=2){
            int b = 0; int a = 0; int l = 0; int o = 0; int n = 0;
            for (int i = 0; i < word.length(); i++) {
                if(word.charAt(i) == 'b') b++;
                else if(word.charAt(i) == 'a') a++;
                else if(word.charAt(i) == 'l') l++;
                else if(word.charAt(i) == 'o') o++;
                else if(word.charAt(i) == 'n') n++;
            }
            l = l/2;
            o = o/2;
            count = Math.min(b, (Math.min(a, (Math.min(l, (Math.min(o, n)))))));
        }
        return count;
    }

    private static void print(String output){
        System.out.println(output);
    }

    private static void print(int number){
        System.out.println(number);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        print("Enter a pool of strings that you want to extract \"ballon\" from: ");
        String poolOfStrings  = scanner.nextLine();
       int numberOfTimes = WordExtractionFromStrings.extractWordFrom(poolOfStrings);
        print(numberOfTimes);
    }
}
