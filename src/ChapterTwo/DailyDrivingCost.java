package ChapterTwo;

import java.util.Scanner;
public class DailyDrivingCost{

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter total miles driven per day");
		double milesDriven = scan.nextDouble();

		System.out.println("Enter cost per gallon of gasoline");
		double gasolineCost = scan.nextDouble();

		System.out.println("Enter average miles per gallon");
		double gallonPerAverageMiles = scan.nextDouble();

		System.out.println("Enter parking fee per day");
		double dailyParkingFee = scan.nextDouble();

		System.out.println("Enter tolls per day");
		double dailyToll= scan.nextDouble();

		double dailyDrivingCost = ((milesDriven / gallonPerAverageMiles) * gasolineCost + dailyParkingFee + dailyToll);

		System.out.printf("Daily driving cost is:  %.3f%n", dailyDrivingCost);
		
		
		}

		}
