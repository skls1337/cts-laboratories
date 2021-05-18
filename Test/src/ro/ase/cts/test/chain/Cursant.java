package ro.ase.cts.test.chain;

public class Cursant {
	private String nume;
	private StareAccidentare stareAccidentare;

	public Cursant(String nume, StareAccidentare stareAccidentare) {
		super();
		this.nume = nume;
		this.stareAccidentare = stareAccidentare;
	}

	protected StareAccidentare getStareAccidentare() {
		return stareAccidentare;
	}

}
