package ro.ase.csie.cts.lab5.dp.singleton;

public class Test {

	public static void main(String[] args) {
		DBConnection con1=DBConnection.getDBConnection();
		DBConnection con2=DBConnection.getDBConnection();
		DBConnection con3=DBConnection.getDBConnection();
		
		
		DBConnection con4=DBConnection.getDBConnection("10.0.0:3306", "db schema");
		
		if(con1==con4) {
			System.out.println("referencing to the same object");
		}
	}

}
