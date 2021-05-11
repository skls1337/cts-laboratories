package ro.ase.csie.cts.g1092.dp.chain;

public class TestChain {

	public static void main(String[] args) {
		ChatHandler englishFilter = new EnglishFilter(7);
		ChatHandler broadcastHandler = new BroadcastMessageHandler();
		ChatHandler privateMessageHandler = new PrivateMessageHandler();

		ChatMessage message1 = new ChatMessage("@everyone", "hai noroi", 2);
		ChatMessage message2 = new ChatMessage("@Tutu", "pe kill bot", 10);
		ChatMessage message3 = new ChatMessage("@Tutu", "salut frt", 222);

		englishFilter.setNext(privateMessageHandler);
		privateMessageHandler.setNext(broadcastHandler);

		ChatHandler chatServer = englishFilter;

		chatServer.processMessage(message1);
		chatServer.processMessage(message2);
		chatServer.processMessage(message3);

	}

}
