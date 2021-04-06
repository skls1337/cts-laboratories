package ro.ase.cts.g1092.assignment2.bankaccount;

import ro.ase.cts.g1092.assignment2.exceptions.InvalidDaysActiveException;
import ro.ase.cts.g1092.assignment2.exceptions.InvalidInterestRateException;
import ro.ase.cts.g1092.assignment2.exceptions.InvalidLoanValueException;

public final class BankAccount {
	private double loanValue;
	private double interestRate;
	private int daysActive;
	private BankAccountType accountType;
	BankAccountValidatorsInterface accountValidatorsInterface = null;

	public int getDaysActive() {
		return daysActive;
	}

	public BankAccount(BankAccountValidatorsInterface accountValidatorsInterface, double loanValue, double interestRate,
			int daysActive, BankAccountType accountType)
			throws InvalidInterestRateException, InvalidLoanValueException, InvalidDaysActiveException {
		if (accountValidatorsInterface == null) {
			throw new NullPointerException();
		} else {
			this.accountValidatorsInterface = accountValidatorsInterface;
			setLoanValue(loanValue);
			setInterestRate(interestRate);
			setDaysActive(daysActive);
			this.accountType = accountType;
		}
	}
	
	private BankAccount() {

	}

	public BankAccountType getAccountType() {
		return accountType;
	}

	public double getLoanValue() {
		return loanValue;
	}

	public double getInterestRate() {
		return this.interestRate;
	}

	// must have method - the lead has requested it in all classes
	public double getMonthlyInterestRate() {
		return loanValue * interestRate;
	}

	private void setLoanValue(double loanValue) throws InvalidLoanValueException {
		// check for negative loan value. if yes throw an error
		accountValidatorsInterface.validateLoanValue(loanValue);
		this.loanValue = loanValue;
	}

	private void setDaysActive(int daysActive) throws InvalidDaysActiveException {
		// check for negative days active. if yes throw an error
		accountValidatorsInterface.validateDaysActive(daysActive);
		this.daysActive = daysActive;
	}

	private void setInterestRate(double interestRate) throws InvalidInterestRateException {
		// check for negative interest rate. if yes throw an error
		accountValidatorsInterface.validateInterestRate(interestRate);
		this.interestRate = interestRate;
	}

	@Override
	public String toString() {
		return "Loan: " + this.loanValue + "; Interest Rate: " + this.interestRate + "; days active:" + daysActive
				+ "; Type: " + accountType + ";";
	}
	

}
