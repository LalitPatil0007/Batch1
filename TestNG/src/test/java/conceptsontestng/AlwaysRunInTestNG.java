package conceptsontestng;

import org.junit.Assert;
import org.testng.annotations.Test;

public class AlwaysRunInTestNG {
	
	
	
	@Test
	public void test0() {
		Assert.fail();
		System.out.println("test 0 executed...............");
	}

	@Test
	public void test1() {
		System.out.println("test 1 executed...............");
	}

	@Test(dependsOnMethods = {"test0"},alwaysRun = false)     
	public void test2() {
		System.out.println("test 2 executed...............");
	}



}
