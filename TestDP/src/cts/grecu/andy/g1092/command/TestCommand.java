package cts.grecu.andy.g1092.command;

public class TestCommand {

	public static void main(String[] args) {
		ProcessorManager manager=new ProcessorManager();
		manager.addTransaction(new AsyncTransactionCommand("BRD Credit Account", "BCR Credit Account", 150, "BCR", new BalanceTransferCommand()));
		manager.addTransaction(new AsyncTransactionCommand("Afa Bank Credit Account", "BRD Credit Account", 150, "Alfa Bank", new BalanceTransferCommand()));
		manager.addTransaction(new AsyncTransactionCommand("BRD Credit Account", "BRD Credit Account", 150, "BRD", new BalanceTransferCommand()));
		manager.addTransaction(new AsyncTransactionCommand("CEC Bank Account", "BCR Credit Account", 150, "BCR", new BalanceTransferCommand()));

		manager.process();
		manager.process();
		manager.process();
		manager.process();
		
		
	}

}
