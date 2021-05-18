package cts.grecu.andy.g1092.adapter;

public abstract class AbstractBankAccount {
	private String accountName;
	private String exchangeRate;
	private double accountBalance;

	public AbstractBankAccount(String accountName, String exchangeRate, double accountBalance) {
		this.accountName = accountName;
		this.exchangeRate = exchangeRate;
		this.accountBalance = accountBalance;
	}

	public String getAccountName() {
		return accountName;
	}

	public String getExchangeRate() {
		return exchangeRate;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

}
