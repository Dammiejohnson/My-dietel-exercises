package ChapterTwo;

import java.util.Scanner;
	public class MultipleNumbers{
	public static void main (String [] args) {
	Scanner digit = new Scanner (System.in);
	
	
	System.out.println("Enter firstInteger: ");
	int firstinteger = digit.nextInt();
	
	System.out.println("Enter secondInteger: ");
	int secondinteger = digit.nextInt();
	
	if (firstinteger % secondinteger == 0) {
	System.out.printf("%d is a multiple of %d\n", firstinteger, secondinteger);
	}
	
	if (firstinteger % secondinteger != 0) {
	System.out.printf("%d is a not multiple of %d\n", firstinteger, secondinteger);
	}
	}
	
	}
