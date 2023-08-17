package BankFactory;

public abstract class CurrentAccount implements Bank{

public void calculateInterest()
{
	System.out.println("Your Interest for the year is Rs. 500");
}
public void createAccount()
{
	System.out.println("Your Current account has been created...");
}
}
