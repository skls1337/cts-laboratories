package ro.ase.cts.g1092.refactoring.phase3;

public enum ProductType {
	NEW(0), DISCOUNTED(0.1f), LIMITED_STOCK(0.25f), LEGACY(0.35f);

	private float discount;

	private ProductType(float discount) {
		this.discount=discount;
	}

	public float getDiscount() {
		return discount;
	}

	

}
