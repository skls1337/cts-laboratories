package acme.bankaccount;

public class FutureBank implements IBankAccount {

	private String name;
	private String address;
	private int accountNo;
	private double accountBalance = 0d;

	public FutureBank(String name, String address, int accountNo) {
		this.name = name;
		this.address = address;
		this.accountNo = accountNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	@Override
	public void transfer(IBankAccount destination, double amount) {
		destination.setAccountBalance(destination.getAccountBalance() + amount);
		this.setAccountBalance(this.getAccountBalance() - amount);

	}

	@Override
	public void deposit(double amount) {
		this.setAccountBalance(this.getAccountBalance() + amount);

	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	@Override
	public String toString() {
		return "FutureBank [name=" + name + ", address=" + address + ", accountNo=" + accountNo + ", accountBalance="
				+ accountBalance + "]";
	}
	

}
