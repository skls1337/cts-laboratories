package grecu.andy.g1092.composite;

import grecu.andy.g1092.builder.User;

public abstract class AbstractNode {
	public abstract void addNode(User user);

	public abstract void removeNode(User user);

	public abstract User getNode(int index);
	
	public abstract void printNodes();
}
