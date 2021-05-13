package acme.bankaccount;

public interface IBankAccount {
	public void transfer(IBankAccount destination, double amount);

	public void deposit(double amount);

	public String getName();

	public String getAddress();

	public int getAccountNo();

	public double getAccountBalance();

	public void setAccountBalance(double accountBalance);

}
