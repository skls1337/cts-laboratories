package ro.ase.cts.g1092.assignment2.bankaccount;

import ro.ase.cts.g1092.assignment2.exceptions.InvalidDaysActiveException;
import ro.ase.cts.g1092.assignment2.exceptions.InvalidInterestRateException;
import ro.ase.cts.g1092.assignment2.exceptions.InvalidLoanValueException;

public interface BankAccountValidatorsInterface {
	public abstract void validateLoanValue(double loanValue) throws InvalidLoanValueException;

	public abstract void validateInterestRate(double interstRate) throws InvalidInterestRateException;

	public abstract void validateDaysActive(int daysActive) throws InvalidDaysActiveException;
}
