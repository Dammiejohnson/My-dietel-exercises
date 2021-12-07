package ChapterTwo;

import java.util.Scanner;

	public class BodyMassIndex{
	public static void main (String[] args){

	Scanner input = new Scanner (System.in);

 	System.out.println("input weight in kilogrammes:");
 	double weight = input.nextDouble();
 
 	System.out.println("input height in metres:");
 	double height = input.nextDouble();
 
 	double bmi = (weight / (height * height) );
 	System.out.printf("Body Mass Index is %.2f%n", bmi);
 	
 	if ( bmi < 18.5){
 	System.out.println("Underweight");
 	}
 	
 	
	if ( bmi >= 18.5 ){  
	if (bmi <= 24.9){
 	System.out.println("Normal");
 	}
 	}
 	
	if ( bmi >= 25 ){
	if (bmi <= 29.9){
 	System.out.println("Overweight");
 	}
 	}
 	
 	
	if ( bmi >= 30){
 	System.out.println("Obese");
 	}


	}
	}
