package acme.singleton_factory;

import acme.bankaccount.CreditAccount;
import acme.bankaccount.DebitAccount;
import acme.bankaccount.IBankAccount;

public class AccountGeneration {
	private static AccountGeneration instance = null;

	private String name;
	private String address;
	private int accountNo;

	private AccountGeneration(String name, String address, int accountNo) {
		this.name = name;
		this.address = address;
		this.accountNo = accountNo;
	}

	public static AccountGeneration getInstance(String name, String address, int accountNo) {
		instance = new AccountGeneration(name, address, accountNo);
		return instance;
	}

	public IBankAccount generateAccount(String accountType) {
		switch (accountType) {
		case "debit":
			return new DebitAccount(instance.name, instance.address, instance.accountNo);

		case "credit":
			return new CreditAccount(instance.name, instance.address, instance.accountNo);

		default:
			throw new UnsupportedOperationException("Unsupported account type");
		}

	}

}
