package chapterSix;

import java.util.Scanner;

public class ModifiedPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a prime number");
        int number = scanner.nextInt();
        System.out.println(isPrimeNumber(number));
        System.out.printf("Prime numbers between 1 and 10000 are: %d%n", primeNumbersTo10000());

    }

    static boolean isPrimeNumber(int primeNumber) {
        int count =0;
        int factor = 0;
        while (factor <= primeNumber){
            factor++;
            if (primeNumber % factor == 0) {
                count +=1;
            }
        }
        if (count == 2) {
            return true;
        } else
            return false;
        }


    static  int primeNumbersTo10000(){
        int primeNumber = 0;
        int i;
        //int total = 0;

        for (i = 2; i <= 10000; i++){
            for (int num = 2; num < i; num++){

                if (i % num == 0) {
                    primeNumber = i;
                    System.out.print("");
                }
            }
            if (i != primeNumber){
                System.out.print(i + " ");

            }

        }
    return i;
    }
}
