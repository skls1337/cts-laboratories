package acme.singleton_factory;

public abstract class AbstractBankAccount {
	protected String name;
	protected String address;
	protected int accountNo;
	protected double accountBalance = 0d;

	public AbstractBankAccount(String name, String address, int accountNo) {
		this.setName(name);
		this.setAddress(address);
		this.setAccountNo(accountNo);
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setName(String name) {
		this.name = name;
	}

}
