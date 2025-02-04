package conceptsontestng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderInTestNG {

	@Test(dataProvider = "testdata")
	public void TestChrome(String name , String middleName ,String lastName){
	
		System.out.println(name +" "+middleName+" "+lastName);
	}
	
	
	
	@DataProvider(name="testdata")      // data provider is the way of achieving parameterization in testNG
	public Object[][] TestData(){
		
	//	Object [][] data = {{"lalit","patil",""},{"Shiv","Vyavhare",""},{"Akshay","Dere",""},{"Pranjal","Gadekar",""}};
		
		
	//	Object [][] data =  new Object[4][3];
		
		

	Object [][] data=new Object[10][5];    // [10] => defines number of execution for test , [5] => number of variables for test
	data[0][0] = "Shiv";
	data[0][1] = "Prakash";
	data[0][2] = "Vyavhare";
	
	
	data[1][0] = "Akshay";
	data[1][1] = "Ranganath";
	data[1][2] = "Dere";
	
	data[2][0] = "Akshay";
	data[2][1] = "Ranganath";
	data[2][2] = "Dere";
	
	

	return data;
	}
}
