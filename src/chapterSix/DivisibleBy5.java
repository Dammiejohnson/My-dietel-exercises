package chapterSix;

import java.util.Scanner;

public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10; i++){
            System.out.println("Enter an integer");
            int num = scanner.nextInt();
            boolean isDivisible = isDivisible(num);
            System.out.println(isDivisible);
        }

    }

    private  static boolean isDivisible (int number){
            if (number % 5 == 0) {return true;}
            else return false;

    }
}
