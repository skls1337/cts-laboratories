package ro.ase.cts.test.chain;

public abstract class HandlerAccidentare {
	HandlerAccidentare next = null;
	StareAccidentare stareAccidentare;

	public void setNext(HandlerAccidentare next) {
		this.next = next;
	}

	public abstract void tratareAccidentare(Cursant cursant,Medic medic);

}
