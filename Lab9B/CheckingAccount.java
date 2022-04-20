package Lab_9B_Renzo_Svartz;

public class CheckingAccount extends BankAccount
{
	public static final double FEE = .15;
	
	public CheckingAccount(String name, double amt)
	{
		super(name, amt);
		super.setAccountNumber(this.getAccountNumber() + "-10");
	}
	
	@Override
	public boolean withdraw(double amount)
	{
		return super.withdraw(amount + FEE);
	}
}
