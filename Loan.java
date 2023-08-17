package BankFactory;

public abstract class Loan implements Bank {
	protected double rate;  
	
	public void createAccount()
	{
		System.out.println("Your Loan account has been created...");
	}
	public void calculateInterest()
	{
		System.out.println("Your Interest for the year is 5%");
	}
	
}
