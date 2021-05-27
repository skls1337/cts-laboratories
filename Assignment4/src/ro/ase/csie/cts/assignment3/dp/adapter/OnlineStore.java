package ro.ase.csie.cts.assignment3.dp.adapter;

import java.util.HashMap;
import java.util.Map;

import ro.ase.csie.cts.assignment3.ServerInterface;
import ro.ase.csie.cts.assignment3.exceptions.ServerException;

public class OnlineStore implements ServerInterface {
	private String name;
	private Map<String, Integer> products = new HashMap<>();
	private String ipAddress;
	private int port;
	
	private final int MAX_CONNECTIONS = 255;
	
	protected String getName() {
		return name;
	}

	protected Map<String, Integer> getProducts() {
		return products;
	}

	public OnlineStore(String name, Map<String, Integer> products,String ipAddress, int port) {
		this.name = name;
		this.products = products;
		this.ipAddress=ipAddress;
		this.port=port;
	}

	
	@Override
	public String toString() {
		return "OnlineStore [name=" + name + ", products=" + products + ", ipAddress=" + ipAddress + ", port=" + port
				+ "]";
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
		System.out.println("Connected");
		return true;
	}

	@Override
	public boolean disconnect() throws ServerException {
		System.out.println("Disconnected");
		return false;
	}

}
