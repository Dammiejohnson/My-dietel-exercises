package chapterFour;

import java.util.Scanner;

public class PassesAndFailuresRecord {
    public static void main(String[] args) {
        calculatePassesAndFails();
    }

    private static void calculatePassesAndFails() {
    Scanner scanner = new Scanner(System.in);
        int passes= 0;
        int fail = 0;

            for (int studentCounter = 1; studentCounter <= 10; studentCounter++) {
                System.out.println("Enter a number (1 for Passes and 2 for Failures) or 0 to exit: ");
                int result = scanner.nextInt();

                if (result == 1) {
                    passes += 1;
                }
                else if (result == 2) {
                    fail += 1;
                }
                else if (result!=1 && result != 2){
                    continue;
                }
                else if ( result == 0) System.exit(0);
                else calculatePassesAndFails();

            }

        System.out.printf("Passed: %d%nFailed: %d%n", passes, fail);
        if (passes > 8) {
            System.out.println("Bonus to the Facilitator");

        }
    }
}
