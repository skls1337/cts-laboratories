package ro.ase.csie.cts.lab5.dp.singleton.enumeration;

public class TestSingletonEnumeration {

	public static void main(String[] args) {
		DBConnection con1=DBConnection.INSTANCE;
		con1.setConnectionString("100.010.10");
		System.out.println(con1.getConnectionString());
		
	}

}
