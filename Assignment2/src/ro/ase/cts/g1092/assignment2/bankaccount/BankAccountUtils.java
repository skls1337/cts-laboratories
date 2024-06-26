package ro.ase.cts.g1092.assignment2.bankaccount;

import java.util.ArrayList;

public final class BankAccountUtils implements BankInterface {

	public static double computeAccountInterest(BankAccount bankAccount) {
		return  (bankAccount.getAccountType() == BankAccountType.PREMIUM
				|| bankAccount.getAccountType() == BankAccountType.SUPER_PREMIUM)
						?BankInterface.BROKER_FEE * Math.abs(bankAccount.getLoanValue()
								* Math.pow(bankAccount.getInterestRate(),
										((double) bankAccount.getDaysActive() / (double) NO_DAYS_PER_YEAR))
								- bankAccount.getLoanValue())
						: 0d;
	}

	public static double computeAccountsTotalFee(ArrayList<BankAccount> bankAccountsList) {
		return bankAccountsList.stream().mapToDouble(BankAccountUtils::computeAccountInterest).sum();
	
	}
}
