package ro.ase.cts.g1092.refactoring.phase5;

import ro.ase.acs.cts.laborator3.exceptions.InvaidValueException;
import ro.ase.acs.cts.laborator3.exceptions.InvalidPriceException;
import ro.ase.acs.cts.laborator3.exceptions.InvalidYearsSinceRegistrationException;

public interface SalesValidatorsInterface {
	public abstract void validatePrice(float initialPrice) throws InvalidPriceException;
	public abstract void validateYearsSinceRegistration(int accountAge) throws InvalidYearsSinceRegistrationException;

}
