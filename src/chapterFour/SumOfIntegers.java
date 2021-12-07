package chapterFour;

import java.util.Scanner;
public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (count < 10){

            System.out.println("enter digits");
            int digit = input.nextInt();
            if (digit>= 1 && digit <= 10) {
                sum += digit;
            }
            count++;

        }
        System.out.println(sum);
    }
}
