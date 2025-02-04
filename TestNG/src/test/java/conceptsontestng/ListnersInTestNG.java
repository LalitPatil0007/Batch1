package conceptsontestng;

import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

// Listener => is an interface with some abstract methods which are used to modify behavior of test execution or reporting


@Listeners(ITestListnerImplementation.class)
public class ListnersInTestNG {

	
	@Test
	public void test0() {
		Assert.fail();
	}

	@Test
	public void test1() {
		System.out.println("test 1 executed...............");
	}

	@Test(dependsOnMethods = {"test0"})
	public void test2() {
		System.out.println("test 2 executed...............");
	}
}
