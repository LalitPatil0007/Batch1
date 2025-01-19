package conceptsontestng;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class PriorityInTestNG {
	
	@Test(priority=-1)
	public void test0() {
		System.out.println("test 0 executed...............");     // -ve , +ve , no priority =>  -ve , no priority(alpha numeric) , +ve 
		
		                                                        // -ve , 0 priority , no priority , +ve priority => -ve , 0 ,no priority(alpha numeric) , +ve
	} 
	
	@Test
	public void test5() {
		System.out.println("test 5 executed...............");
	}

	@Test
	public void test6() {
		System.out.println("test 6 executed...............");
	}

	@Test(priority=0)
	public void test1() {
		System.out.println("test 1 executed...............");
	}
	
	@Test(priority=1)
	public void test2() {
		System.out.println("test 2 executed...............");
	}
	
	@Test(priority=2)
	public void test3() {
		System.out.println("test 3 executed...............");
	}
	
	@Test(priority=3)
	public void test4() {
		System.out.println("test 4 executed...............");
	}

}
