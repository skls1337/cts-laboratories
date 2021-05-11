package acme.bankaccount;

public class AbstractBankAccount {
	private String name;
	private String address;
	private int accoutCount;
	protected double balance;

	public AbstractBankAccount(String name, String address, int accoutCount) {
		super();
		this.name = name;
		this.address = address;
		this.accoutCount = accoutCount;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
