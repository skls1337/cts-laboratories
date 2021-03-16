package ro.ase.cts.g1092.refactoring.phase5;

import ro.ase.acs.cts.laborator3.exceptions.InvaidValueException;
import ro.ase.acs.cts.laborator3.exceptions.InvalidPriceException;
import ro.ase.acs.cts.laborator3.exceptions.InvalidYearsSinceRegistrationException;
import ro.ase.cts.g1092.refactoring.phase5.marketing.MarketingStrategyInterface;

public class SalesStrategy {

	private MarketingStrategyInterface mkStrategy = null;
	private SalesValidatorsInterface validator = null;

	public SalesStrategy(MarketingStrategyInterface mkStrategy, SalesValidatorsInterface validator) {
		if (mkStrategy == null | validator == null) {
			throw new NullPointerException();
		}
		this.mkStrategy = mkStrategy;
		this.validator = validator;
	}

	//optional
	//allowing the change at runtime of the marketing strategy
	public void setMarketingStrategy(MarketingStrategyInterface mkStrategy) {
		if(mkStrategy==null) {
			throw new NullPointerException();
		}
		this.mkStrategy=mkStrategy;
	}
	
	public static float getPriceWithDiscount(float initialPrice, float discount, float fidelityDiscount) {
		float initialDiscount = initialPrice - (discount * initialPrice);
		return initialDiscount * (1 - fidelityDiscount);
	}

	public float computeFinalPrice(ProductType productType, float initialPrice, int yearsSinceRegistration)
			throws InvaidValueException, InvalidPriceException, InvalidYearsSinceRegistrationException {

		validator.validatePrice(initialPrice);
		validator.validateYearsSinceRegistration(yearsSinceRegistration);
		float fidelityDiscount = (productType != ProductType.NEW)
				? mkStrategy.getFidelityDiscount(yearsSinceRegistration)
				: 0;
		float finalPrice = getPriceWithDiscount(initialPrice, productType.getDiscount(), fidelityDiscount);

		return finalPrice;
	}

}