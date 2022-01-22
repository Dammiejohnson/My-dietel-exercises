package chapterSix;

import java.util.Scanner;

public class GCDCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        print("Enter two numbers to get their gcd");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        getGcd(num1, num2);

    }

    static int getGcd(int num1, int num2) {
       int gcd = 1;
        for(int factor = 1; factor <= num1 && factor <= num2; factor++) {
            if(num1 % factor == 0 && num2 % factor == 0)
                gcd = factor;
        }
        System.out.printf("GCD of %d and %d is %d", num1, num2, gcd);
        return gcd;
    }

    static  String print(String message){
        System.out.println("Enter two numbers to get their gcd");
        return "message";
        }
}