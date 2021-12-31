package chapterFour;

import java.util.Scanner;

public class Palindrome {
    public static void main (String [] args) {
        Scanner digit = new Scanner(System.in);
        int number = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        boolean isValue = true;


        System.out.println("Enter any five digit number: ");
        number = digit.nextInt();
        while (isValue) {

            if (number >= 10000 && number <= 99999) {
                isValue = false;
            } else{
                System.out.println("Enter another number");
                number = digit.nextInt();
        }

                a = number / 10000;
                System.out.print(a);

                b = (number % 10000) / 1000;
                System.out.print(b);

                c = (number % 1000) / 100;
                System.out.print(c);

                d = (number % 100) / 10;
                System.out.print(d);

                e = (number % 10) / 1;
                System.out.println(e);

        }
        if (a == e){
            if (b == d){
                System.out.printf("%d is a palindrome\n", number);
            }
        }

        if (a != e){
            if (b != d){
                System.out.printf("%d is not a palindrome\n", number);
            }
        }

    }

}

