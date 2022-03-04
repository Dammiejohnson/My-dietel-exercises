package ChapterTwo;

import java.util.Scanner;
	public class GuessNumber {
	public static void main (String[] args) {
	
  Scanner figure = new Scanner (System.in);
  int guess = 7;
  System.out.println("guess a number");
  int digit = figure.nextInt();
  
	if (digit==guess)
	System.out.println("digit is equal");
	
	if (digit>guess)
	System.out.println("digit is greater");
	
	if (digit<guess)
	System.out.println("digit is less");
	
	
	
	
	
	
	
	
	}
	
	}
