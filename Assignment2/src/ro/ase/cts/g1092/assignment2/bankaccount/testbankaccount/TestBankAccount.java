package ro.ase.cts.g1092.assignment2.bankaccount.testbankaccount;

import java.util.ArrayList;
import ro.ase.cts.g1092.assignment2.bankaccount.BankAccountType;
import ro.ase.cts.g1092.assignment2.bankaccount.BankAccount;
import ro.ase.cts.g1092.assignment2.bankaccount.BankAccountUtils;
import ro.ase.cts.g1092.assignment2.bankaccount.BankAccountValidatorsInterface;
import ro.ase.cts.g1092.assignment2.exceptions.InvalidDaysActiveException;
import ro.ase.cts.g1092.assignment2.exceptions.InvalidInterestRateException;
import ro.ase.cts.g1092.assignment2.exceptions.InvalidLoanValueException;
import ro.ase.cts.g1092.assignment2.validatorservice.BankAccountValidatorService;

public class TestBankAccount {

	public static void main(String[] args)
			throws InvalidInterestRateException, InvalidLoanValueException, InvalidDaysActiveException {
		BankAccountValidatorService bankAccountValidatorService = new BankAccountValidatorService();
		// Testing validations
		// BankAccount bankAccount1 = new BankAccount(bankAccountValidatorService, 100,
		// -0.442,780 ,BankAccountType.BUDGET);
		// BankAccount bankAccount1 = new BankAccount(bankAccountValidatorService, -100,
		// 0.442,780 ,BankAccountType.BUDGET);
		// BankAccount bankAccount1 = new BankAccount(bankAccountValidatorService, 100,
		// 0.442,-780 ,BankAccountType.BUDGET);

		BankAccount bankAccount1 = new BankAccount(bankAccountValidatorService, 100, 0.442, 780,
				BankAccountType.BUDGET);
		BankAccount bankAccount2 = new BankAccount(bankAccountValidatorService, 1200, 0.12, 100,
				BankAccountType.SUPER_PREMIUM);
		BankAccount bankAccount3 = new BankAccount(bankAccountValidatorService, 300, 0.262, 123,
				BankAccountType.SUPER_PREMIUM);
		BankAccount bankAccount4 = new BankAccount(bankAccountValidatorService, 500, 0.2, 531,
				BankAccountType.STANDARD);
		BankAccount bankAccount5 = new BankAccount(bankAccountValidatorService, 750, 0.2, 1123,
				BankAccountType.SUPER_PREMIUM);
		BankAccount bankAccount6 = new BankAccount(bankAccountValidatorService, 125, 0.2, 431, BankAccountType.BUDGET);
		BankAccount bankAccount7 = new BankAccount(bankAccountValidatorService, 100, 0.52, 11231,
				BankAccountType.BUDGET);
		BankAccount bankAccount8 = new BankAccount(bankAccountValidatorService, 120, 0.12, 3451,
				BankAccountType.SUPER_PREMIUM);
		BankAccount bankAccount9 = new BankAccount(bankAccountValidatorService, 1660, 0.23, 451,
				BankAccountType.STANDARD);
		BankAccount bankAccount10 = new BankAccount(bankAccountValidatorService, 4870, 0.02, 1457,
				BankAccountType.PREMIUM);

		System.out.println(bankAccount1.toString());
		System.out.println("The interest is: " + BankAccountUtils.computeAccountInterest(bankAccount1));
		System.out.println("The interest is: " + BankAccountUtils.computeAccountInterest(bankAccount2));

		ArrayList<BankAccount> bankAccounts = new ArrayList<>();
		bankAccounts.add(bankAccount1);
		bankAccounts.add(bankAccount2);
		bankAccounts.add(bankAccount3);
		bankAccounts.add(bankAccount4);
		bankAccounts.add(bankAccount5);
		bankAccounts.add(bankAccount6);
		bankAccounts.add(bankAccount7);
		bankAccounts.add(bankAccount8);
		bankAccounts.add(bankAccount9);
		bankAccounts.add(bankAccount10);

		System.out.println("Total fee accounts: " + BankAccountUtils.computeAccountsTotalFee(bankAccounts));
	}

}
