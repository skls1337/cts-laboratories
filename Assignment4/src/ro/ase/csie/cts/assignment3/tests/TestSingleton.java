package ro.ase.csie.cts.assignment3.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ro.ase.csie.cts.assignment3.dp.singleton.Singleton;

public class TestSingleton {

	static Singleton instance = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		instance = Singleton.getInstance("192.168.0.0", 2556);
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
	public void testSingleton() {
		Singleton instance2 = Singleton.getInstance("192.168.0.1", 2556);

		assertEquals("Testing instance referencing to the same object", instance, instance2);

	}

}
