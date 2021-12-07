package ChapterTwo;

import java.util.Scanner;
	public class LargerEqual{
	public static void main (String [] args) {
	Scanner digit = new Scanner (System.in);
	
	
	System.out.println("Enter first Integer");
	int firstInteger = digit.nextInt();
	
	System.out.println ("Enter second Integer");
	int secondInteger = digit.nextInt();
	
	if (firstInteger > secondInteger) {
	System.out.printf("%d is larger\n", firstInteger);
	}
	
	if (secondInteger > firstInteger) {
	System.out.printf("%d is larger\n", secondInteger);
	}
	
	
	if (secondInteger == firstInteger) {
	
	System.out.printf("%d and %d are equal\n", firstInteger, secondInteger);
	}
	
	
	
	}
	
	}
