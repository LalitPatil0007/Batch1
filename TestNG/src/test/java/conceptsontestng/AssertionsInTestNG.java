package conceptsontestng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsInTestNG {
	
	// HardAssert => assertion fail => terminate  flow at that point  , SoftAssert  => if assertion fail continue flow at last in console shows which assertion failed
	
	@Test
	public void assertionDetail() {
		

		
		String textFromUI = "Amazon";
		String textToValid = "Amazon";
		
		
//		Assert.assertEquals(textFromUI, textToValid);
		
//		Assert.assertTrue(textFromUI.equals(textToValid),"actual from UI is :"+textFromUI+" Expected was :"+textToValid);
		
		
		
//		System.out.println("code after assertion");
		
//		Assert.fail("Failing this test ");
				
		
//		Assert.assertEquals(false, ,"Message if assertion fails");
//		Assert.assertFalse(false,,"Message if assertion fails");
//		Assert.assertFalse(True,"Message if assertion fails");
//		Assert.fail("Message why you want to fail test");
		
		SoftAssert softAssert = new SoftAssert();
		System.out.println("code before assertion");
		softAssert.assertFalse(textFromUI.equals(textToValid));
		System.out.println("code after assertion");
		softAssert.assertEquals(textFromUI,textToValid);
		softAssert.assertAll();

		
//		softAssert.assertFalse(false);
//		softAssert.assertEquals();
//		softAssert.assertAll();
//		
	
	}

}
