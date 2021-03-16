package ro.ase.cts.g1092.refactoring.phase5.services;

import ro.ase.acs.cts.laborator3.exceptions.InvalidPriceException;
import ro.ase.acs.cts.laborator3.exceptions.InvalidYearsSinceRegistrationException;
import ro.ase.cts.g1092.refactoring.phase5.SalesValidatorsInterface;

public class ValidatorService implements SalesValidatorsInterface {

	@Override
	public void validatePrice(float initialPrice) throws InvalidPriceException {
		if (initialPrice <= 0) {
			throw new InvalidPriceException();
		}

	}

	@Override
	public void validateYearsSinceRegistration(int accountAge) throws InvalidYearsSinceRegistrationException {
		if (accountAge < 0) {
			throw new InvalidYearsSinceRegistrationException();
		}

	}

}
