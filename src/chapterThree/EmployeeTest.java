package chapterThree;

import java.util.Scanner;
public class EmployeeTest{
	public static void main(String[] args){
	
		/*Employee miju = new Employee("Taiwo","Joseph",45000);
		Employee lekan = new Employee("Sanni", "Johnson", 90000);
		
	
		System.out.printf("%s %s salary is %.2f%n",miju.getFirstName(),miju.getLastName(),miju.getSalary());
		System.out.printf("%s %s salary is %.2f%n",lekan.getFirstName(),lekan.getLastName(),lekan.getSalary()); */
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first name: ");
		String firstName = input.nextLine();
		
		System.out.println("Enter last name: ");
		String lastName = input.nextLine();
		
		System.out.println("Enter the salary amount: ");
		double salary = input.nextDouble();
		
		Employee miju = new Employee(firstName,lastName,salary);
		
		System.out.printf("%s %s salary is %.2f%n",miju.getFirstName(),miju.getLastName(),miju.getSalary());
		System.out.printf("%s %s yearly salary is %.2f%n",miju.getFirstName(),miju.getLastName(),miju.getYearlySalary());
		System.out.printf("%s %s yearly salary with ten percent increase is %.2f%n",miju.getFirstName(),miju.getLastName(),miju.getAddSalaryIncrease());
		// note that i am using miju.firstname because i want to use my miju from the instatiation of the object to retrieve the one in the other file.
		
		System.out.println();
		
		Scanner bin = new Scanner(System.in);
		// a new retrieval was used because it was skipping the first name aspect while i tried using the old one
		System.out.println("Enter first name: ");
		String newFirstName = bin.nextLine();
		
		System.out.println("Enter last name: ");
		String newlastName = bin.nextLine();
		//using next.line because its a type string
		
		System.out.println("Enter the salary amount: ");
		double newsalary = input.nextDouble();
		
		
		Employee lekan = new Employee(newFirstName,newlastName,newsalary);

		System.out.printf("%s %s salary is %.2f%n",lekan.getFirstName(),lekan.getLastName(),lekan.getSalary());
		System.out.printf("%s %s yearly salary is %.2f%n",lekan.getFirstName(),lekan.getLastName(),lekan.getYearlySalary()); 
		System.out.printf("%s %s yearly salary with ten percent increase is %.2f%n",lekan.getFirstName(),lekan.getLastName(),lekan.getAddSalaryIncrease());
	}

}
