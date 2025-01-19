import static org.junit.Assert.*;

import org.junit.*;
import org.junit.Test;
import org.testng.annotations.BeforeTest;

public  class Demo1 {


	@BeforeClass
	public static void beforeClass() {
		System.out.println("before Class -> at beginning of class");
	}
	

	
	@Before
	public  void before() {
		System.out.println("before test");

	}
	
	@Test
	public  void test() {
		System.out.println("Test content");
	}
	
	@Test
	public  void test1() {
		System.out.println("Test content 1");
	}
	
	@Test
	public  void test2() {
		System.out.println("Test content 2");
	}
	
	@After
	public  void after() {
		System.out.println("after test");

	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("at end of class");

	}
	

	
}
