package ro.ase.csie.cts.state;

import ro.ase.csie.cts.sources.ICerereStudent;

public class SendingRequestState implements ICerereStudent {

	@Override
	public void confirmare() {
		System.out.println("Sending Request");
		verificare();
	}

	@Override
	public void verificare() {
		System.out.println("Verifying Request");
	}

	@Override
	public void avizareDecanat() {

	}

	@Override
	public void respingere() {

	}

}
