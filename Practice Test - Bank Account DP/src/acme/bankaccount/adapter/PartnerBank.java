package acme.bankaccount.adapter;

import acme.bankaccount.AbstractBankAccount;
import acme.bankaccount.BankAccountInterface;

public class PartnerBank implements BankAccountInterface {

	private String name;
	private String address;
	private int accountCount;
	private double balance;

	
	
	public PartnerBank(String name, String address, int accountCount) {
		super();
		this.name = name;
		this.address = address;
		this.accountCount = accountCount;
	}

	@Override
	public void transfer(AbstractBankAccount desination, double sum) {
		desination.setBalance(desination.getBalance() + sum);
		balance -= sum;

	}

	@Override
	public void deposit(double sum) {
		balance += sum;

	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	protected String getName() {
		return name;
	}

	protected String getAddress() {
		return address;
	}

	protected int getAccountCount() {
		return accountCount;
	}

	
	
}
