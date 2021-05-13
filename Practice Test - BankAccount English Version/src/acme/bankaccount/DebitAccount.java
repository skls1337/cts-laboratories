package acme.bankaccount;

import acme.singleton_factory.AbstractBankAccount;

public class DebitAccount extends AbstractBankAccount implements IBankAccount {

	public DebitAccount(String name, String address, int accountNo) {
		super(name, address, accountNo);
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

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getAddress() {

		return address;
	}

	@Override
	public int getAccountNo() {

		return accountNo;
	}

	@Override
	public String toString() {
		return "DebitAccount [name=" + name + ", address=" + address + ", accountNo=" + accountNo + ", accountBalance="
				+ accountBalance + "]";
	}

}
