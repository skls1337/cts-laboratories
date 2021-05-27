package ro.ase.csie.cts.assignment3.dp.prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import ro.ase.csie.cts.assignment3.ServerInterface;
import ro.ase.csie.cts.assignment3.exceptions.ServerException;

public class Prototype implements ServerInterface, Cloneable {
	private String ipAddress;
	private int port;

	private final int MAX_CONNECTIONS = 255;

	List<Integer> expensiveResources = null;

	public Prototype(String ipAddress, int port) {

		System.out.println("Importing expensive resources...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.expensiveResources = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < 500; i++) {
			this.expensiveResources.add(random.nextInt(500));
		}
		System.out.println("Verifying connection to " + ipAddress + " " + port);
		this.ipAddress = ipAddress;
		this.port = port;

	}

	private Prototype() {

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
		System.out.println("Connected to " + ipAddress + " on port " + port);
		return true;

	}

	@Override
	public boolean disconnect() throws ServerException {
		System.out.println("Disconnecting");
		return false;

	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Prototype clone = new Prototype();
		clone.ipAddress = ipAddress;
		clone.port = port;
		clone.expensiveResources = expensiveResources;
		return clone;
	}

}
