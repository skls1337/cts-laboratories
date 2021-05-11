package ro.ase.csie.cts.g1092.dp.chain;

public class EnglishFilter extends ChatHandler {

	public static String[] forbiddenWords = { "violent", "hit", "kill" };
	int ageLimit;

	public EnglishFilter(int ageLimit) {
		super();
		this.ageLimit = ageLimit;
	}

	@Override
	public void processMessage(ChatMessage message) {
		boolean isSafe = true;
		for (String word : forbiddenWords) {
			if (message.getText().toLowerCase().contains(word)) {
				isSafe = false;
				break;
			}
		}
		if (isSafe) {
			if (this.next != null) {
				this.next.processMessage(message);
			}
		}
	}

}
