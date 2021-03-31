package ro.ase.cts.g1092.assignment2.validatorservice;

import ro.ase.cts.g1092.assignment2.bankaccount.BankAccountValidatorsInterface;
import ro.ase.cts.g1092.assignment2.exceptions.InvalidDaysActiveException;
import ro.ase.cts.g1092.assignment2.exceptions.InvalidInterestRateException;
import ro.ase.cts.g1092.assignment2.exceptions.InvalidLoanValueException;

public class BankAccountValidatorService implements BankAccountValidatorsInterface {

	@Override
	public void validateLoanValue(double loanValue) throws InvalidLoanValueException {
		if (loanValue < 0) {
			throw new InvalidLoanValueException("Loan value cannot take negative values", 100);
		}

	}

	@Override
	public void validateInterestRate(double interstRate) throws InvalidInterestRateException {
		if (interstRate < 0) {
			throw new InvalidInterestRateException("Loan value cannot take negative values", 100);
		}

	}

	@Override
	public void validateDaysActive(int daysActive) throws InvalidDaysActiveException {
		if (daysActive < 0) {
			throw new InvalidDaysActiveException("Days active cannot take negative values", 100);
		}
	}

}
