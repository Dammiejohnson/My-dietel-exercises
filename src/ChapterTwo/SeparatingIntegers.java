package ChapterTwo;

import java.util.Scanner;
	public class SeparatingIntegers{
	public static void main (String [] args) {
	Scanner digit = new Scanner (System.in);
	
	
	System.out.println("Enter any five digit number: ");
	int number = digit.nextInt();
	
	System.out.print(number /10000 + " ");
	System.out.print((number % 10000) / 1000 + " " );
	System.out.print((number % 1000) / 100 + " ");
	System.out.print((number % 100) / 10 + " " );
	System.out.println((number % 10) + " ");
	
	
	}
	
	}
