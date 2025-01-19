package conceptsontestng;

import org.testng.annotations.Test;

public class EnableInTestNG {

	
	@Test(priority=1,enabled = true)
	public void test5() {
		System.out.println("test 5 executed...............");
	}

	@Test(priority=0,enabled = false)
	public void test6() {
		System.out.println("test 6 executed...............");
	}

}
