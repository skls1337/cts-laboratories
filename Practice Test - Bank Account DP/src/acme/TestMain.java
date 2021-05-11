package acme;

import java.util.ArrayList;
import java.util.List;

import acme.bankaccount.AbstractBankAccount;
import acme.bankaccount.BankAccountInterface;
import acme.bankaccount.adapter.BankAccountAdapter;
import acme.bankaccount.adapter.PartnerBank;
import acme.bankaccount.singleton_factory.AccountGeneration;

public class TestMain {

	public static void main(String[] args) {
		AccountGeneration accountGeneration = AccountGeneration.generateAccount("Savings account", "Str. Da", 1);
		AbstractBankAccount debitAccount = accountGeneration.createAccount("debit");
		accountGeneration = AccountGeneration.generateAccount("Personal needs account", "Str. Nu", 2);
		AbstractBankAccount creditAccount = accountGeneration.createAccount("credit");

		System.out.println(debitAccount.toString());
		System.out.println(creditAccount.toString());

		List<AbstractBankAccount> bankAccounts = new ArrayList<>();
		bankAccounts.add(creditAccount);
		bankAccounts.add(debitAccount);

		PartnerBank partnerBank = new PartnerBank("Savings account", "Str. bine", 1);
		partnerBank.setBalance(7500);
		BankAccountAdapter partnerBankAdapter = new BankAccountAdapter(partnerBank);
		bankAccounts.add(partnerBankAdapter);

		creditAccount.setBalance(1500);
		debitAccount.setBalance(1000);

		((BankAccountInterface) creditAccount).transfer(debitAccount, 100);

		System.out.println(creditAccount.getBalance());
		System.out.println(debitAccount.getBalance());

		((BankAccountInterface) creditAccount).transfer(partnerBankAdapter, 150);

		System.out.println(creditAccount.getBalance());
		System.out.println(partnerBankAdapter.getBalance());

		partnerBankAdapter.partnerBank.transfer(creditAccount, 150);

		System.out.println(creditAccount.getBalance());
		System.out.println(partnerBankAdapter.getBalance());

	}

}
