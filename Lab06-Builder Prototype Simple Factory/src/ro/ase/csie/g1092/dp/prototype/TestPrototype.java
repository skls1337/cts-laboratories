package ro.ase.csie.g1092.dp.prototype;

public class TestPrototype {

	public static void main(String[] args) {
		Tree3DModel tree1 = new Tree3DModel("Green", 110);
		Tree3DModel tree2 = new Tree3DModel("Black Green", 210);
		Tree3DModel tree3 = new Tree3DModel("Green", 110);
		
		try {
			Tree3DModel tree4=(Tree3DModel) tree1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
