package cts.grecu.andy.g1092.factory;

public class TestFactory {

	public static void main(String[] args) {

		BankAccount creditAccount = BankFactory.getBankAccount(AccountType.CREDIT, 500, "ID_11");
		BankAccount debitAccount = BankFactory.getBankAccount(AccountType.DEBIT, 550, "ID_12");
		BankAccount juniorAccount = BankFactory.getBankAccount(AccountType.JUNIOR, 200, "ID_13");

		System.out.println(creditAccount.toString());
		System.out.println(debitAccount.toString());
		System.out.println(juniorAccount.toString());

	}

}
