package cts.grecu.andy.g1092.adapter;

public class MasterCardAccount {
	private String accountName;
	private String exchangeRate;
	private double accountBalance;

	public String getAccountName() {
		return accountName;
	}

	public String getExchangeRate() {
		return exchangeRate;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public MasterCardAccount(String accountName, String exchangeRate, double accountBalance) {
		this.accountName = accountName;
		this.exchangeRate = exchangeRate;
		this.accountBalance = accountBalance;
	}

	
	
}
