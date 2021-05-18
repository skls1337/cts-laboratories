package ro.ase.csie.cts.state;

import ro.ase.csie.cts.sources.ICerereStudent;

public class SoftwareRobot {

	private final int MAX_DAYS_DEADLINE=10;

	private ICerereStudent requestInterface = null;



	public SoftwareRobot() {
		
		this.requestInterface=new SendingRequestState();
	}

	public void viewRequestStatus() {
		if(requestInterface!=null) {
			requestInterface.confirmare();
		}else {
			throw new UnsupportedOperationException();
		}
	}
	
	public void sendRequest(int days) {
		if(days>=MAX_DAYS_DEADLINE) {
			requestInterface=new RejectedState();
			requestInterface.respingere();
		}else {
			requestInterface=new AcceptedState();
			requestInterface.avizareDecanat();
		}
	}
	

}
