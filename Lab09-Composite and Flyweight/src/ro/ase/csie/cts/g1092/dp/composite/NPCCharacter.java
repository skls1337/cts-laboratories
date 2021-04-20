package ro.ase.csie.cts.g1092.dp.composite;

public class NPCCharacter extends AbstractNode {

	String name;
	int power;

	public NPCCharacter(String name, int power) {
		this.name = name;
		this.power = power;
	}

	@Override
	public void attack(String playerName) {
		System.out.println(name+ " is attacking " + playerName);
	}

	@Override
	public void retreat() {
		System.out.println(name+ " is retreating ");
	}

	@Override
	public void move() {
		System.out.println(name+ " is moving ");
	}

	@Override
	public void addNode(AbstractNode node) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void removeNode(AbstractNode node) {
		throw new UnsupportedOperationException();
	}

	@Override
	public AbstractNode getNode(int index) {
		throw new UnsupportedOperationException();
	}

}
