package acme.bankaccount;

public interface BankAccountInterface {
	public void transfer(AbstractBankAccount desination, double sum);

	public void deposit(double sum);
}
