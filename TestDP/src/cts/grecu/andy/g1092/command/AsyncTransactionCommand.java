package cts.grecu.andy.g1092.command;

public class AsyncTransactionCommand extends AsyncTransaction {

	private String sourseAccount;
	private String destinationAccount;
	private double value;
	private String destinationBank;
	private BankModule bankModule = null;

	public AsyncTransactionCommand(String sourseAccount, String destinationAccount, double value,
			String destinationBank, BankModule bankModule) {
		this.sourseAccount = sourseAccount;
		this.destinationAccount = destinationAccount;
		this.value = value;
		this.destinationBank = destinationBank;
		this.bankModule = bankModule;
	}

	@Override
	public void executeTransaction() {
		bankModule.processTransaction(sourseAccount, destinationAccount, value, destinationBank);
	}

	@Override
	public String getDestinedAccount() {
		return destinationAccount;
	}

	@Override
	public String getDestinationBank() {
		return destinationBank;
	}

}
