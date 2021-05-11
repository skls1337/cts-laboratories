package acme.bankaccount.adapter;

import acme.bankaccount.AbstractBankAccount;

public class BankAccountAdapter extends AbstractBankAccount {

	public PartnerBank partnerBank=null;
	
	public BankAccountAdapter(PartnerBank partnerBank) {
		super(partnerBank.getName(),partnerBank.getAddress(),partnerBank.getAccountCount());
		this.setBalance(partnerBank.getBalance());
		this.partnerBank=partnerBank;
	}
	
}
