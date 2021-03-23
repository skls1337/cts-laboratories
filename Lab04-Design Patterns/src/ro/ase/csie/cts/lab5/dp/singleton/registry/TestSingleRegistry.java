package ro.ase.csie.cts.lab5.dp.singleton.registry;

public class TestSingleRegistry {

	public static void main(String[] args) {
		DBConnection con1=DBConnection.getConnection("10.0.0.1:3306", "DB Conection Dev");
		DBConnection con2=DBConnection.getConnection("10.0.0.1:3306", "DB Conection Dev");
		DBConnection con3=DBConnection.getConnection("11.0.0.1:3306", "DB Connection Production ");
		
		if(con1==con2) {
			System.out.println("they are the same");
		}
		if(con1!=con3) {
			System.out.println("different");
		}
	}

}
