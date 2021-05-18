package cts.grecu.andy.g1092.command;

public abstract class AsyncTransaction {
	public abstract void executeTransaction();
	public abstract String getDestinedAccount();
	public abstract String getDestinationBank();
}
