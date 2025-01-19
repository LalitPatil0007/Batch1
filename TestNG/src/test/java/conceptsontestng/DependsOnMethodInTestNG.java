package conceptsontestng;

import org.testng.annotations.Test;

public class DependsOnMethodInTestNG {

	
	
	@Test(enabled = true)
	public void test0() {
		System.out.println("test 0 executed...............");
	}

	@Test
	public void test1() {
		System.out.println("test 1 executed...............");
	}

	@Test(dependsOnMethods = {"test0","test1"})
	public void test2() {
		System.out.println("test 2 executed...............");
	}
}
