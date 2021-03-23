package ro.ase.csie.cts.lab5.dp.singleton;

public class DBConnection {
	String socket;
	String schema;

	//private static DBConnection dbConn = new DBConnection();
	private static DBConnection dbConn = null;
	
	
	//class static initializer
	static {
		//executed only once when the class is loaded by the JVM
		System.out.println("Loading db connection string...Connected");
	}
	
	//constructor initializer
	{
		//executed before each constructor call
	}

	public DBConnection() {
		System.out.println("Db connection");
	}

	private DBConnection(String socket, String schema) {
		this.socket = socket;
		this.schema = schema;
	}
	
	public static DBConnection getDBConnection() {
		if(DBConnection.dbConn==null) {
			dbConn=new DBConnection();
		}
		return DBConnection.dbConn;
	}
	public static DBConnection getDBConnection(String socket,String schema) {
		if(DBConnection.dbConn==null) {
			dbConn=new DBConnection(socket,schema);
		}
		
		return DBConnection.dbConn;
	}

}
