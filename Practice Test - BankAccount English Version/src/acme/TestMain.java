package acme;

import java.util.ArrayList;
import java.util.List;

import acme.adapter.BankAdapter;
import acme.bankaccount.CreditAccount;
import acme.bankaccount.FutureBank;
import acme.bankaccount.IBankAccount;
import acme.singleton_factory.AbstractBankAccount;
import acme.singleton_factory.AccountGeneration;

public class TestMain {

	public static void main(String[] args) {
		try {
			AccountGeneration generatingAccount = AccountGeneration.getInstance("Credit Card", "Str. Drumul Binelui",
					1);
			IBankAccount creditAccount = generatingAccount.generateAccount("credit");
			generatingAccount = AccountGeneration.getInstance("Debit account", "Str. Drumul Binelui", 2);
			IBankAccount debitAccount = generatingAccount.generateAccount("debit");
			// AbstractBankAccount exception=generatingAccount.generateAccount("debi");

			FutureBank futureBank = new FutureBank("Future Bank Acc", "Str. Drumul Binelui", 3);
			BankAdapter adapater1 = new BankAdapter(debitAccount);
			BankAdapter adapater2 = new BankAdapter(creditAccount);
			
			List<FutureBank> banks = new ArrayList<>();
			banks.add(adapater1);
			banks.add(adapater2);
			banks.add(futureBank);

			creditAccount.setAccountBalance(150);
			debitAccount.setAccountBalance(200);
			futureBank.setAccountBalance(300);

			futureBank.transfer(debitAccount, 10);

			System.out.println("Future Bank Balance: " + futureBank.getAccountBalance());
			System.out.println("Debit Account Balance: " + debitAccount.getAccountBalance());

			for(FutureBank bank:banks) {
				System.out.println(bank.toString());
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
