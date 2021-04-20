package ro.ase.csie.cts.g1092.dp.flyweight;

import java.util.ArrayList;
import java.util.List;

public class TestFlywieght {

	public static void main(String[] args) {
		List<NPCCoordinates> soldiers = new ArrayList<>();
		soldiers.add(new NPCCoordinates(10, 10, 10, "red"));
		soldiers.add(new NPCCoordinates(10, 10, 115, "green"));
		soldiers.add(new NPCCoordinates(10, 115, 10, "yellow"));

		Model3DFlyweight soldierModel=(Model3DFlyweight) new Model3DFactory().getModel(ModelType.SOLDIER);
		
		for(NPCCoordinates coords:soldiers) {
			soldierModel.display(coords);
		}
		
	}

}
