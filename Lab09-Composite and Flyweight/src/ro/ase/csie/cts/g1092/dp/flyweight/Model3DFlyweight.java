package ro.ase.csie.cts.g1092.dp.flyweight;

import java.util.*;

public class Model3DFlyweight implements Model3DFlyweightInterface {

	//shared data
	String modelName;
	List<Integer>points=new ArrayList<>();
	
	
	
	@Override
	public void loadModel(String fileName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display(NPCCoordinates coordinates) {
		System.out.println("X:"+ coordinates.X+" Y:"+coordinates.Y+" Z: "+coordinates.Z);
		
	}

}
