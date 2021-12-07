package ChapterTwo;

import java.util.Scanner;
	public class OddEven{
	public static void main (String [] args) {
	Scanner digit = new Scanner (System.in);
	
	
	System.out.println("Enter Integer");
	int integer = digit.nextInt();
	
	
	if (integer % 2 == 0) {
	System.out.printf("%d is an even number\n", integer);
	}
	
	if (integer % 2 != 0) {
	System.out.printf("%d is an odd number\n", integer);
	}
	
	

	}
	
	}
