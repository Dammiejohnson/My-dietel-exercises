package chapterThree;

import java.util.Scanner;
public class AccountTest{
	public static void main(String[] args){
		Account input = new Account("Dami",20000000);
		
		System.out.printf("%s has a balance of %.2f%n",input.getName(),input.getBalance());
		
		input.deposit(-1000);
		//this is to set from the input object
		
		System.out.printf("After depositing %s has a balance of %.2f%n",input.getName(),input.getBalance());
		
		System.out.println();
		
		Scanner old = new Scanner(System.in);
		System.out.println("Enter withdrawal Amount: ");
		double withdraw = old.nextDouble(); //old here is from class scanner, just a name to retrive withdraw
		
		input.withdrawal(withdraw);
		//this means that the withdrawal input takes the value of the prompt
		
		System.out.printf("After withdrawal %s has a balance of %.2f%n",input.getName(),input.getBalance());
		
	
	}



}
