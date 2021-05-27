package ro.ase.csie.cts.assignment3.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ro.ase.csie.cts.assignment3.dp.prototype.Prototype;

public class TestPrototype {

	static Prototype prototype=null;
	static String ipAddress;
	static int port;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ipAddress="192.168.0.1";
		port=25565;
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		prototype=new Prototype(ipAddress, port);
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
	public void testPrototype() throws CloneNotSupportedException {
		Prototype prototype2=(Prototype) prototype.clone();
		assertNotEquals("Testing cloning mechanism",prototype,prototype2);
	}

}
