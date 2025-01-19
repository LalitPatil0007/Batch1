package testngex;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Case3 {
	@Test
	public void test3() {
		System.out.println("test 3 executed...............");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite Executed");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("after Suite Executed");
	}

}
