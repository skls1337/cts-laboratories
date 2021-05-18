package ro.ase.csie.cts.command;

import java.util.ArrayList;
import java.util.List;

import ro.ase.csie.cts.sources.TipCerere;

public class RequestManager {
	private List<Requests> requests = new ArrayList<>();

	public void addRequests(Requests request) {
		requests.add(request);
	}

	public void process() {
		for(Requests request:requests) {
			if(request.getRequestType().equals(TipCerere.URGENTA)) {
				request.executeRequest();
				requests.remove(request);
				return;
			}
		}
		if(requests.size()>0) {
			requests.get(0).executeRequest();
			requests.remove(0);
		}
		
	}
}
