package chapterFour;

import java.util.Scanner;

public class GasMilege {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int miles = 0;
        int gallons = 0;
        int totalMilesPerGallon = 0;
        int counter = 0;
        double milesPerGallons = 0;



        while ( miles != -1 && gallons != -1){
            System.out.println("Enter the  number of miles");
                     miles = scanner.nextInt();
            System.out.println("Enter the amount of gallons");
                    gallons = scanner.nextInt();
                    if (miles != -1 && gallons != -1) {
                        milesPerGallons = (miles * 1.0) / gallons;
                        totalMilesPerGallon += milesPerGallons;
                        System.out.println("The miles per gallon for this trip is:" + milesPerGallons);
                    }
                     counter++;


        }
        System.out.println("The total miles per gallon for your trips is" + totalMilesPerGallon);

    }
}
