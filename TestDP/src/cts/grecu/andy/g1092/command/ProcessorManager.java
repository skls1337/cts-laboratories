package cts.grecu.andy.g1092.command;

import java.util.ArrayList;
import java.util.List;

public class ProcessorManager {
	private List<AsyncTransaction> transactions = new ArrayList<>();

	public void addTransaction(AsyncTransaction transaction) {
		transactions.add(transaction);
	}

	public void process() {
		for (AsyncTransaction transaction : transactions) {
			if (transaction.getDestinedAccount().contains(transaction.getDestinationBank())) {
				transaction.executeTransaction();
				transactions.remove(transaction);
				return;
			}
		}
		if (transactions.size() > 0) {
			transactions.get(0).executeTransaction();
			transactions.remove(0);
		}
	}
}
