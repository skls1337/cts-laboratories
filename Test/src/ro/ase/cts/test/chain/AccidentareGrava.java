package ro.ase.cts.test.chain;

public class AccidentareGrava extends HandlerAccidentare{

	@Override
	public void tratareAccidentare( Cursant cursant,Medic medic) {
		if (this.next != null && (cursant.getStareAccidentare().equals(StareAccidentare.ACCIDENTAT)
				|| cursant.getStareAccidentare().equals(StareAccidentare.GRAV_ACCIDENTAT))) {
			this.next.tratareAccidentare(cursant, medic);
		} else {
			if (medic != null) {
				System.out.println("Se apeleaza ambulanta");
			
			} else {
				System.out.println("Nu exista medic");
			}

		}
		
	}

}
