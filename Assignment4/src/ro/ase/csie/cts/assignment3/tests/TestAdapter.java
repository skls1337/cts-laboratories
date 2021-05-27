package ro.ase.csie.cts.assignment3.tests;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ro.ase.csie.cts.assignment3.dp.adapter.OnlineStore;
import ro.ase.csie.cts.assignment3.dp.adapter.Store;
import ro.ase.csie.cts.assignment3.dp.adapter.StoreAdapter;

public class TestAdapter {
	static OnlineStore onlineStore;
	static Store store;
	static Map<String,Integer>products=null;
	static Map<String,Integer>products2=null;
	static String ipAddress;
	static int port;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ipAddress="37.192.24.0.5";
		port=25574;
		
		products=new HashMap<>();
		products.put("Clothes", 1);
		products.put("Microwave", 2);
		
		products2=new HashMap<>();
		products2.put("Apples", 1);
		products2.put("Grapes", 2);
	
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		onlineStore=new OnlineStore(ipAddress, products, ipAddress, port);
		store=new Store("LaMama",products2);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Ignore
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testAdapter() {
		StoreAdapter adapter=new StoreAdapter(onlineStore);
		
		assertEquals("Testing adapter base class",store.getClass(), adapter.getClass().getSuperclass());
	}

}
