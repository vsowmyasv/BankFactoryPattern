package BankFactory;

public abstract class SavingsAccount implements Bank{
	public void createAccount()
	{
		System.out.println("Your Savings account has been created...");
	}
	public void showBalance()
	{
		System.out.println("Your current balance in this account is Rs.20000");
	}
}
