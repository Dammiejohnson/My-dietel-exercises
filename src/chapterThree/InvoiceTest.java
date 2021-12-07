package chapterThree;

import java.util.Scanner;
public class InvoiceTest{
	public static void main(String[] args){
		//Invoice inv = new Invoice("001","Book",30,100);
		
		//	System.out.printf("%s has a part number of %s%n%n",inv.getPartNumber(),inv.getDescription());
		//	System.out.printf("The quantity: %d%n The Price of %s : %.2f%n%n The invoice Amount: %.2f",inv.getQuantity(),inv.getDescription(),inv.getPrice(),inv.getInvoiceAmount());
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the part number: ");
		String partnumber = input.nextLine();
		System.out.println("Enter the description of the product: ");
		String description =input.nextLine();
		System.out.println("Enter the quantity: ");
		int quantity = input.nextInt();
		System.out.println("Enter the price: ");
		double price = input.nextDouble();
		
		Invoice inv  = new Invoice (partnumber,description,quantity,price);
		
		System.out.printf("%s has a part number of %s%n",inv.getPartNumber(),inv.getDescription());
			
			System.out.printf("The quantity: %d%n The Price of %s : %.2f%n%n The invoice Amount: %.2f%n",inv.getQuantity(), inv.getDescription(), inv.getPrice(), inv.getInvoiceAmount());
		
	}

}
