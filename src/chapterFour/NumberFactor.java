package chapterFour;

import java.util.Scanner;
public class NumberFactor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = input.nextInt();
      int count =0;


//        for (int factor = 1; factor <= number; factor++) {
//            if (number % factor == 0){
//                System.out.printf("%d is a factor of %d%n", factor, number);
//                factor = factor+1;
//            }
//        }
//        System.out.printf( "%d has %d factors", number, factor);

        int factor = 0;
        while (factor <= number){
            factor++;
            if (number % factor == 0) {
                System.out.printf("%d is a factor of %d%n", factor, number);
                count = count + 1;
            }
        }
        System.out.println(count);
        if (count == 2) {
            System.out.println(number+ " "+"is a prime number");
        } else {
            System.out.println(number+ " "+"is not a prime number");
        }
    }
}
