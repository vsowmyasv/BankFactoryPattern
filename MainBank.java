package BankFactory;

public class MainBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CurrentAccountFunctionalities ca = new CurrentAccountFunctionalities();
		
		ca.createAccount();
		ca.calculateInterest();
		ca.showBalance();
		
		LoanFunctionalities la = new LoanFunctionalities();
		
		la.createAccount();
		la.calculateInterest();
		la.calculateLoanPayment(40000, 2);
		
		SavingsAccountFunctionalities sa = new SavingsAccountFunctionalities();
		
		sa.createAccount();
		sa.calculateInterest();
		sa.showBalance();
		
	}

}
