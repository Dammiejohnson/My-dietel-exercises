package exercises;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
    fibonacciCalculator();
    }
    private static void fibonacciCalculator(){
        int number1 = 0;
        int number2 = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of count for the series");
        int count = input.nextInt();
        for (int i= 0; i<=count; i++){
            System.out.print(number1 + " ");
            int nextNumber = number1 + number2;
            number1 = number2;
            number2 = nextNumber;
        }
    }
}
