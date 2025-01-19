package conceptsontestng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterFromXMLInTestNG {
	
	@Test
	@Parameters({"firstname","lastname"})
	public void printNamesValueFromXML(String firsname ,String lastname) {
		System.out.println(firsname);
		System.out.println(lastname);
		
	}

}
