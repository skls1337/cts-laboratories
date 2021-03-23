package ro.ase.csie.cts.lab5.dp.singleton.enumeration;


//implement the singleton as an enumaration
public enum DBConnection {
	 INSTANCE;

    String connString;

    public String getConnectionString() {
        return connString;
    }

    public void setConnectionString(String connString) {
        this.connString = connString;
    }
}
