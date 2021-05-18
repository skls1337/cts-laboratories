package ro.ase.csie.cts.command;

import ro.ase.csie.cts.sources.IProcesatorCerere;
import ro.ase.csie.cts.sources.TipCerere;

public class ProcessRequestSomething implements IProcesatorCerere{

	@Override
	public void procesareCerere(TipCerere tip, String denumire) {
		System.out.println("Processing "+tip+" "+denumire);
		
	}

}
