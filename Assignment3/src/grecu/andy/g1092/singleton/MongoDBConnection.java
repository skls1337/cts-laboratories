package grecu.andy.g1092.singleton;

public class MongoDBConnection {
	private static MongoDBConnection mongoConnection=null;
	private String username;
	private String password;
	private String mongoUrl;
	
	private MongoDBConnection(String mongoUrl,String username,String password) {
		this.username=username;
		this.password=password;
		this.mongoUrl=mongoUrl;
	}
	static{
		System.out.println("Connecting...");
	}
	private MongoDBConnection() {
		
	}
	
	public static MongoDBConnection getMongoConnection(String mongoUrl,String username,String password) {
		if (mongoConnection==null) {
			mongoConnection=new MongoDBConnection(mongoUrl,username, password);
		}
		System.out.println("Connected to: "+mongoConnection.mongoUrl);
		return MongoDBConnection.mongoConnection;
	}
	
}
