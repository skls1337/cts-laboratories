package grecu.andy.g1092.composite;

import java.util.ArrayList;
import java.util.List;

import grecu.andy.g1092.builder.User;

public class UserComposite extends AbstractNode {

	public List<User> users = null;

	public UserComposite() {
		this.users = new ArrayList<>();
	}

	@Override
	public void addNode(User user) {
		users.add(user);
	}

	@Override
	public void removeNode(User user) {
		users.remove(user);
	}

	@Override
	public User getNode(int index) {
		return users.get(index);
	}

	@Override
	public void printNodes() {
		for(User user:users) {
			System.out.println(user.toString());
		}
		
	}

}
