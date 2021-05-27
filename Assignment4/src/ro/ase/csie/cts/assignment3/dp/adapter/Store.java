package ro.ase.csie.cts.assignment3.dp.adapter;

import java.util.HashMap;
import java.util.Map;

public  class Store {
	private String name;
	private Map<String, Integer> products = new HashMap<>();

	public Store(String name, Map<String, Integer> products) {
		this.name = name;
		this.products = products;
	}

	protected String getName() {
		return name;
	}

	protected Map<String, Integer> getProducts() {
		return products;
	}

	@Override
	public String toString() {
		return "Store [name=" + name + ", products=" + products + "]";
	}

	
	
}
