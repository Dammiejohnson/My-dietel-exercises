package ChapterTwo; 	/*i want to create an application that tells calculates the prices of a book item based on the
 	number of item they get.
 	1. ask the retailer for the number of copies they want
 	2. have a range of the amount for each copy 
 	3. depending on the number or quantity of copies that they want, calculate the amount of each copy
 		for example between one and four copies will cost N200O PER COPY of the book and the amount reduces as range gets higher.

	*/


import java.util.Scanner;
	public class RetailPrices{
		public static void main(String [] args){
		Scanner input = new Scanner (System.in);
		
		System.out.println ("Enter the number of copies you want: ");
		int copyNumber = input.nextInt();
		
		if (copyNumber >= 1){
			if (copyNumber <= 4){ 
			System.out.printf("The cost is N2000 per copy which results to N%d%n", copyNumber * 2000);
			}
		}
		
		
		
		if (copyNumber >=5 ){
			if (copyNumber <= 9){ 
			System.out.printf("The cost is N1800 per copy which results to N%d%n", copyNumber * 1800);
			}
		}
		
		if (copyNumber >= 10){
			if (copyNumber <= 29){ 
			System.out.printf("The cost is N1600 per copy which results to N%d%n", copyNumber * 1600);
			}
		}
		
		
		if (copyNumber >= 30){
			if (copyNumber <= 49){ 
			System.out.printf("The cost is N1500 per copy  which results to N%d%n", copyNumber * 1500);
			}
		}
		
		
		
		if (copyNumber >= 50){
			if (copyNumber <= 99){ 
			System.out.printf("The cost is N1300 per copy which results to N%d%n", copyNumber * 1300);
			}
		}
		
		
		
		if (copyNumber >= 100){
			if (copyNumber <= 199){ 
			System.out.printf("The cost is N1200 per copy which results to N%d%n", copyNumber * 1200);
			}
		}
		
		
		if (copyNumber >= 200){
			if (copyNumber <= 499){ 
			System.out.printf("The cost is N1100 per copy which results to  N%d%n", copyNumber * 1100);
			}
		}
		
		
		if (copyNumber >= 500){
			System.out.printf("The cost is N1100 per copywhich results to N%d%n", copyNumber * 1000);
		}
		
		
	}
  }
