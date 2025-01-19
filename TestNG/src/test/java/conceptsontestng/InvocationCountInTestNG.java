package conceptsontestng;

import org.testng.annotations.Test;

public class InvocationCountInTestNG {
	@Test(invocationCount = 3)
	public void test5() {
		System.out.println("test 5 executed...............");
	}

	@Test
	public void test6() {
		System.out.println("test 6 executed...............");
	}


}
