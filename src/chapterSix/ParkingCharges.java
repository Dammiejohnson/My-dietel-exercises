package chapterSix;

import java.util.Scanner;

public class ParkingCharges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of hours parked at the garage");
         int hour = scanner.nextInt();
        System.out.printf("Your parking charge for %d hours is $%.2f", hour, calculateCharge(hour));

    }

    public static double calculateCharge(int time){
        double minimumFee = 2.00;
        double maximumFee = 10.00;
        int minimumHour = 3;

        double fee = 0.0;
        if (time <= minimumHour) {
            fee = minimumFee;

        }
        else  if  ((time > minimumHour) && (time < 17)) {
            fee = minimumFee + (0.50* (time - 3));

        }
        else
            fee = maximumFee;

        return fee;
    }
}

