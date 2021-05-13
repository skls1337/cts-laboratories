package acme.bankaccount.singleton_factory;

import acme.bankaccount.AbstractBankAccount;
import acme.bankaccount.CreditAccount;
import acme.bankaccount.DebtorAccount;

public class AccountGeneration {
	private static AccountGeneration accountGeneration = null;
	private String name;
	private String address;
	private int accoutCount;

	private AccountGeneration(String name, String address, int accoutCount) {
		this.name = name;
		this.address = address;
		this.accoutCount = accoutCount;
	}

	public static AccountGeneration generateAccount(String name, String address, int accountCount) {
		if (accountGeneration == null) {
			accountGeneration = new AccountGeneration(name, address, accountCount);
		}
		return accountGeneration;
	}
	
	public AbstractBankAccount createAccount(String accountType) {
		AbstractBankAccount bankAccount=null;
		switch(accountType) {
		case "credit":
			bankAccount= new CreditAccount(accountType, accountType, accoutCount);
			break;
		case "debit":
			bankAccount=new DebtorAccount(accountType, accountType, accoutCount);
			break;
		}
		return bankAccount;
	}
	
}
