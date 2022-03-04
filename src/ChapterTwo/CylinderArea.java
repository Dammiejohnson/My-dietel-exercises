package ChapterTwo;

import java.util.Scanner;
  
	public class CylinderArea{
	
		public static void main (String[] args){
	
	Scanner volumecalc = new Scanner (System.in);
		System.out.println("radius");
		
	double radius= volumecalc.nextDouble();
	
	double pi= 3.142;
	
	double cylinderArea = radius * radius * pi;
		
		System.out.printf("The area is %f%n", cylinderArea);
			
	}	
		
    }

