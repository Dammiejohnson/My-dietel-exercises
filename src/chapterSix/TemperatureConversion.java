package chapterSix;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in kelvin");
        double temperature = scanner.nextDouble();
        System.out.printf("%.2f in Kelvin is %.2f degrees in celsius%n", temperature, covertToCelsius(temperature));
        System.out.println();
        System.out.println("Enter temperature in celsius");
        double temperature2 = scanner.nextDouble();
        System.out.printf("%.2f degrees in celsius is %.2f in kelvin", temperature2, covertToKelvin(temperature2));

    }

    static double covertToKelvin(double temperatureInCelsius){
        double temperatureInKelvin = temperatureInCelsius + 273.15;
        return temperatureInKelvin;
    }

    static double covertToCelsius(double temperatureInKelvin){
        double temperatureInCelsius = temperatureInKelvin - 273.15;
        return temperatureInCelsius;
    }
}
