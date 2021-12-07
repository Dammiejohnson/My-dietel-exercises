package ChapterTwo;

import java.util.Scanner;
public class PopulationGrowthRateCalc {
    public static void main (String [] args) {
 
 	Scanner input = new Scanner (System.in);
         
         
        System.out.print ("Enter Current World Population: ");
        long currentPopulation = input.nextLong();
        
        System.out.print ("Enter Annual Population Growth Rate: ");
        double growthRate = input.nextDouble();
        
        double annualPopIncrease = (growthRate / 100) * currentPopulation;
        double estimatedPop = currentPopulation + annualPopIncrease;
 
 
        System.out.println("Estimated population after one year:     " + estimatedPop);
        System.out.println("Estimated population after two years:    " + estimatedPop + (annualPopIncrease * 2));
        System.out.println("Estimated population after three years:  " + estimatedPop + (annualPopIncrease * 3));
        System.out.println("Estimated population after four years:   " + estimatedPop + (annualPopIncrease * 4));
        System.out.println("Estimated population after five years:   " + estimatedPop + (annualPopIncrease * 5));
 
    	}
	}
