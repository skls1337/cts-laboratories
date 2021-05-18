package ro.ase.csie.cts.command;

import ro.ase.csie.cts.sources.IProcesatorCerere;
import ro.ase.csie.cts.sources.TipCerere;

public class RequestCommand extends Requests {

	private TipCerere tipCerere;
	private String requestName;
	IProcesatorCerere processRequest = null;

	public RequestCommand(String requestName, TipCerere tipCerere,IProcesatorCerere processRequest ) {
		this.requestName = requestName;
		this.tipCerere = tipCerere;
		this.processRequest=processRequest;
	}

	public TipCerere getTipCerere() {
		return tipCerere;
	}

	@Override
	public void executeRequest() {
		processRequest.procesareCerere(tipCerere, requestName);
	}

	@Override
	public TipCerere getRequestType() {
		
		return tipCerere;
	}

}
