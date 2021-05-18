package ro.ase.cts.test.chain;

public class Medic {
	private String numeMedic;

	public Medic(String numeMedic) {
		this.numeMedic = numeMedic;
	}

	public String getNumeMedic() {
		return numeMedic;
	}

	public void callMedic() {
		System.out.println(numeMedic + "  investigheaza");
	}
}
