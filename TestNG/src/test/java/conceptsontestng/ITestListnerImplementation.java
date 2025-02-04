package conceptsontestng;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListnerImplementation implements ITestListener {
	
	  public void onTestStart(ITestResult result) {
		  System.out.println("Test which is executing : "+result.getName());
		  }
	  
	  public void onTestSuccess(ITestResult result) {
		  System.out.println("Test which is pass : "+result.getName());
		  
		  
		  
	  }
	  
	  public void onTestFailure(ITestResult result) {
		  System.out.println("Test which is failed : "+result.getName());
		  }
	  
	  public void onTestSkipped(ITestResult result) {
		  System.out.println("Test which is skipped : "+result.getName());
		  }


}
