package ro.ase.csie.cts.assignment3.dp.singleton;

import ro.ase.csie.cts.assignment3.ServerInterface;
import ro.ase.csie.cts.assignment3.exceptions.ServerException;

public class Singleton implements ServerInterface {
	private static Singleton instance = null;
	private String ipAddress;
	private int port;

	private final int MAX_CONNECTIONS = 255;

	private Singleton(String ipAddress, int port) {
		super();
		this.ipAddress = ipAddress;
		this.port = port;
	}

	public static Singleton getInstance(String ipAddress, int port) {
		if (instance == null) {
			instance = new Singleton(ipAddress, port);
		}
		return instance;
	}

	@Override
	public String getIpAddress() {
		return ipAddress;
	}

	@Override
	public int getPort() {
		return port;
	}

	@Override
	public int getMaxConnections() {
		return MAX_CONNECTIONS;
	}

	@Override
	public boolean connect() throws ServerException {
		if(instance!=null) {			
			System.out.println("Connected to "+ipAddress+" on port "+port);
			return true;
		}else {
			throw new ServerException();
		}
	}

	@Override
	public boolean disconnect() throws ServerException {
		if(instance!=null) {
			System.out.println("Disconnecting");
			instance=null;
			return false;
		}else {
			throw new ServerException();
		}
	}
}
