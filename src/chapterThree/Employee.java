package chapterThree;

public class Employee{
	private String firstName;
	private String lastName;
	private double salary;
	
	public Employee(String firstName, String lastName, double salary){
		
		this.firstName = firstName;
		this.lastName = lastName;
		if(salary < 0){
		
			System.out.println("Salary is negative!!");
			salary = 0;
			this.salary = salary;
		}
		this.salary = salary;
		
	// please note that whenever you initialize with the constructor , the conditions of the instance variables should be in the constructor and the set method, please note that it is not compulsory to be in the set method if initialised already in the constructor
	}
	
	public void setFirstName (String firstName){
		this.firstName = firstName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public void setSalary(double salary){
		if(salary < 0){
		
			System.out.println("Salary is negative!!");
			salary = 0;
			this.salary = salary;
		}
		this.salary = salary;
	}
	
	public double getYearlySalary(){
		return getSalary() * 12;

	}
	
	public double getSalaryIncrease(){
		return getYearlySalary() * 0.1;
	
	}
	public double getAddSalaryIncrease(){
		return getSalaryIncrease() + getYearlySalary();
	}
	
	
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public double getSalary(){
		return salary;
	}


}
