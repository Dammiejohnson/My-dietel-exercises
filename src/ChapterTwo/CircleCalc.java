package ChapterTwo;

import java.util.Scanner;
	public class CircleCalc {
	public static void main (String [] args) {
	Scanner digit = new Scanner(System.in);
	
	System.out.println ("Enter radius");
	int radius = digit.nextInt();
	
	double PiConstant = Math.PI;
	
	int diameter = radius * 2;
	double circumference = diameter * Math.PI;
	double area = Math.PI * (radius * radius);
	
	
	
	System.out.printf("The diameter of the circle is: %d%n", diameter);
	System.out.printf("The circumference of the circle is: %.2f%n", circumference);
	System.out.printf("The area of the circle is: %.2f%n", area);
	
	}
	}
