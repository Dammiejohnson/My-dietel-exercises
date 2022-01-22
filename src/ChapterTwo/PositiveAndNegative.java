package ChapterTwo;

import java.util.Scanner;
	public class PositiveAndNegative {
	public static void main (String [] args) {

	Scanner input = new Scanner (System.in);
	
	System.out.println("Enter first number:");
	int a = input.nextInt();

	System.out.println("Enter second number:");
	int b = input.nextInt();

	System.out.println("Enter third number:");
	int c = input.nextInt();
	
	System.out.println("Enter fourth number:");
	int d = input.nextInt();

	System.out.println("Enter fifth number:");
	int e = input.nextInt();
	
	 int positiveCount = 0;
	 int negativeCount = 0;
	 int zeroCount = 0;
	 
	if (a > 0){
		positiveCount++;
	}
		else if (a < 0){
		negativeCount++;
		}
			else if (a == 0){
			zeroCount++;
			}			
	boolean bIsPositive = b > 0;
	if (bIsPositive){
	positiveCount++;
	}
		if (b < 0){
		negativeCount++;
		}
			if (b == 0){
			zeroCount++;
			}	


	if (c > 0){
	positiveCount++;
	}
		if (c < 0){
		negativeCount++;
		}
			if (c == 0){
			zeroCount++;
			}	

	if (d > 0){
	positiveCount++;
	}
		if (d < 0){
		negativeCount++;
		}
			if (d == 0){
			zeroCount++;
			}	



	if (e > 0){
	positiveCount++;
	}
		if (e < 0){
		negativeCount++;
		}
			if (e == 0){
			zeroCount++;
			}
			
		System.out.printf("the number of positive integer(s) is %d%n", positiveCount);
		System.out.printf("the number of negative integer(s) is %d%n", negativeCount);
		System.out.printf("the number of zero integer(s) is %d%n", zeroCount);	


	}
	}
