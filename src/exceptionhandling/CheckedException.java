package exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {
	
	
	public static void serachFile(String path) throws FileNotFoundException,NoSuchFieldError,NoSuchMethodError,UnAuthorisedUser  {
		
	
			FileInputStream fis = new FileInputStream(path);

			
			
			
			
			
		
	}

	public static void main(String[] args) {

		serachFile("path");

	}

}
