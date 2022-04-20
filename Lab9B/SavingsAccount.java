package Lab_9B_Renzo_Svartz;

public class SavingsAccount extends BankAccount
{
	private double rate = .025;
	private int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount(String name, double amount)
	{
		super(name, amount);
		System.out.println("1: " +  savingsNumber);
		accountNumber = super.getAccountNumber() + "-" + this.savingsNumber++;
		System.out.println("1: " +  savingsNumber);
	}
	
	public SavingsAccount(SavingsAccount oldAccount, double amount)
	{
		super(oldAccount, amount);
		accountNumber = super.getAccountNumber() + "-" + oldAccount.savingsNumber++;
	}
	
	public void postInterest()
	{
		setBalance(getBalance() * (1 + rate / 12));
	}
	
	@Override
	public String getAccountNumber()
	{
		return accountNumber;
	}
}
