package chapterThree;

public class Account{
	private String name;
	private double balance;
	
			public Account(String name, double balance){
			this.name = name;
			this.balance = balance;
	}
	
	public String getName(){
		return name;
		}
	public double getBalance(){return balance;}
	public void setName(String name){
		this.name = name;
	}
	
	public void deposit(double deposit){
		if(deposit < 0.0){
			System.out.println("Deposit cannot be less than 0");
			deposit = 0;	
		}
		balance = balance + deposit;
		}
	
	public void withdrawal(double withdrawal){
		if(withdrawal > balance){
			System.out.println("Withdrawal amount exceeded account balance!!!!!");
			withdrawal = 0;
			this.balance = balance;
			
		}
		balance = balance - withdrawal;
	}
}

