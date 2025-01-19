package conceptsontestng;

import org.testng.annotations.Test;

public class GroupInTestNG {

	@Test(groups = {"regression","smoke"})
	public void test0() {
		System.out.println("test 0 executed...............");
	}

	@Test(groups = {"regression"})
	public void test1() {
		System.out.println("test 1 executed...............");
	}

	@Test(groups = {"smoke"})
	public void test2() {
		System.out.println("test 2 executed...............");
	}
	
	
	@Test(groups = {"sanity"})
	public void test3() {
		System.out.println("test 3 executed...............");
	}

	@Test(groups = {"sanity"})
	public void test4() {
		System.out.println("test 4 executed...............");
	}
}
