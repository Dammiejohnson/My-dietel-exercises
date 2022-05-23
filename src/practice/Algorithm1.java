package practice;

import java.util.Scanner;

public class Algorithm1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the marks");
        int input1 = scanner.nextInt();
        int [] input2 = new int[input1];
        calculateMinimumsum(input1, input2);

    }


    public static void calculateMinimumsum(int input1, int[] input2) {
        input2 = new int[input1];
        int total = 0;
        for (int i = 0; i < input2.length; i++) {
            for (int j = i + 1; j < input2.length; j++) {
                if (input2[i] == input2[j]) {
                    input2[j] = input2[j] + 1;
                }
            }
            for (int number : input2) {
                total += number;
            }
            System.out.println(total);

        }
    }
}

