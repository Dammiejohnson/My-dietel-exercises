package ChapterTwo;

import java.util.Scanner;
	public class AlmightyFormular{
	
	
	   public static void main (String[] args) {
	   Scanner quadraticformular = new Scanner (System.in);
	   
	   System.out.println("a=");
	   int number1 = quadraticformular.nextInt();
	   
	   System.out.println("b=");
	   int number2 = quadraticformular.nextInt();
	   
	   System.out.println("c=");
	   int number3= quadraticformular.nextInt();
	   
	 
	   int number4 = (number2 * number2) - (4 * number1 * number3);

	   double x1 = (-(number2) + Math.sqrt(number4) ) / (2*number1);
	   double x2 = (-(number2) - Math.sqrt(number4) ) / (2*number1);
	   
	   System.out.printf("the roots of the equations are %f%n and %f%n", x1, x2);
	   
	   
	   }
	  
	}
