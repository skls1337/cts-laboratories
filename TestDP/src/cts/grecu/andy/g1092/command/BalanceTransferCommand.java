package cts.grecu.andy.g1092.command;

public class BalanceTransferCommand extends BankModule {

	@Override
	public void processTransaction(String sourseAccount, String destinationAccount, double value,
			String destinationBank) {
		System.out.println("Transfering balance of "+value+" from account "+sourseAccount+" to "+destinationAccount+" destination bank being+ "+destinationBank);
		
	}

}
