package cts.grecu.andy.g1092.factory;



public class BankFactory {
	public static BankAccount getBankAccount(AccountType accountType,double balance,String id) {
		BankAccount bankAccount=null;
		switch (accountType) {
		case CREDIT: {
			bankAccount=new CreditAccount(balance, id,10,5000);
			break;
		}
		case DEBIT:
			bankAccount=new DebitAccount(balance, id,false,false);
			break;
		case JUNIOR:
			bankAccount=new JuniorAccount(balance, id);
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + accountType);
		}
		return bankAccount;
	}
}
