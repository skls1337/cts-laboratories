package ro.ase.csie.cts.command;

import ro.ase.csie.cts.sources.TipCerere;

public abstract class Requests {
	public abstract void executeRequest();
	public abstract TipCerere getRequestType();
}
