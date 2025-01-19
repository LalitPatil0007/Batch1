package conceptsontestng;

import org.testng.annotations.Test;

public class GroupsInTestNG1 {
	@Test(groups = {"regression","smoke"})
	public void test0() {
		System.out.println("test 0 executed. from group1..............");
	}

	@Test(groups = {"regression"})
	public void test1() {
		System.out.println("test 1 executed.....from group1..........");
	}

	@Test(groups = {"smoke"})
	public void test2() {
		System.out.println("test 2 executed......from group1.........");
	}
	
	
	@Test(groups = {"sanity"})
	public void test3() {
		System.out.println("test 3 executed......from group1.........");
	}

	@Test(groups = {"sanity"})
	public void test4() {
		System.out.println("test 4 executed....from group1...........");
	
}
}
