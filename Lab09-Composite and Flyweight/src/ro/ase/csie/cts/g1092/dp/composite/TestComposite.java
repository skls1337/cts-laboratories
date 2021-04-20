package ro.ase.csie.cts.g1092.dp.composite;

public class TestComposite {

	public static void main(String[] args) {
		AbstractNode group1=new Group("Red Team");
		group1.addNode(new NPCCharacter("Soldier R 1", 100));
		group1.addNode(new NPCCharacter("Soldier R 2", 100));
		
		AbstractNode group2=new Group("Blue Team");
		group2.addNode(new NPCCharacter("Soldier B 1", 100));
		group2.addNode(new NPCCharacter("Soldier B 2", 100));
		
		AbstractNode levelGroup=new Group("level 2");
		levelGroup.addNode(new NPCCharacter("Boss", 500));
		levelGroup.addNode(new NPCCharacter("Boss", 500));
		levelGroup.addNode(group1);
		levelGroup.addNode(group2);
		
		levelGroup.attack("Superman");
		levelGroup.retreat();
		levelGroup.getNode(0).move();
		
	}

}
