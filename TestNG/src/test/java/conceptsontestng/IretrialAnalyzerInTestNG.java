package conceptsontestng;

import org.junit.Assert;
import org.testng.annotations.Test;

public class IretrialAnalyzerInTestNG {
	
	@Test(retryAnalyzer = Retry.class)
	public void test5() {
		Assert.fail();
	}

	@Test(retryAnalyzer = Retry.class)
	public void test6() {
		System.out.println("test 6 executed...............");
	}


}

