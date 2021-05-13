package acme.adapter;

import acme.bankaccount.FutureBank;
import acme.bankaccount.IBankAccount;

public class BankAdapter extends FutureBank {
	IBankAccount acmeAccount = null;

	public BankAdapter(IBankAccount acmeAccount) {
		super(acmeAccount.getName(), acmeAccount.getAddress(), acmeAccount.getAccountNo());
		this.acmeAccount = acmeAccount;
	}

}
