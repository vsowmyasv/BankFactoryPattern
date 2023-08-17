package BankFactory;

public abstract class SavingsAccount implements Bank{
	public void createAccount()
	{
		System.out.println("Your Savings account has been created...");
	}
	public void calculateInterest()
	{
		System.out.println("Your Interest for the year is 6%");
	}
}
