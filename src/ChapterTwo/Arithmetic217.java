package ChapterTwo;

import java.util.Scanner;
	public class Arithmetic217 {
	public static void main (String [] args) {
	Scanner digit = new Scanner(System.in);
	
	System.out.println ("Enter first integer");
	int firstInteger = digit.nextInt();
	
	System.out.println ("Enter second integer");
	int secondInteger = digit.nextInt();
	
	System.out.println ("Enter third integer");
	int thirdInteger = digit.nextInt();
	
	int sum = firstInteger + secondInteger + thirdInteger;
	int average = (firstInteger + secondInteger + thirdInteger) / 3;
	int product = firstInteger * secondInteger * thirdInteger;
	
	System.out.printf("The sum of the numbers is: %d%n", sum);
	System.out.printf("The average of the numbers is: %d%n", average);
	System.out.printf("The product of the numbers is: %d%n", product);
	
	
	if (firstInteger > secondInteger) {
	 if (firstInteger> thirdInteger){
	 System.out.printf("%d is the largest\n", firstInteger);
	}
	}
	
	
	if (firstInteger < secondInteger) {
	 if (firstInteger < thirdInteger){
	 System.out.printf("%d is the smallest\n", firstInteger);
	}
	}
	
	if (secondInteger > firstInteger) {
	 if (secondInteger > thirdInteger){
	 System.out.printf("%d is the largest\n", secondInteger);
	}
	}
	
	
	if (secondInteger < firstInteger) {
	 if (secondInteger < thirdInteger){
	 System.out.printf("%d is the smallest\n", secondInteger);
	}
	
	}
	
	if (thirdInteger > secondInteger) {
	 if (thirdInteger > firstInteger){
	 System.out.printf("%d is the largest\n", thirdInteger);
	}
	
	}
	
	
	if (thirdInteger < secondInteger) {
	 if (thirdInteger < firstInteger){
	 System.out.printf("%d is the smallest\n", thirdInteger);
	}
	}
	
	
	}
	}
