package ro.ase.csie.cts.g1092.dp.chain;

public class ChatMessage {
	String destination;
	String text;
	int priority;

	public ChatMessage(String destination, String text, int priority) {
		this.destination = destination;
		this.text = text;
		this.priority = priority;
	}

	public String getText() {
		return text;
	}

	public String getDestination() {
		return destination;
	}

	public int getPriority() {
		return priority;
	}

}
