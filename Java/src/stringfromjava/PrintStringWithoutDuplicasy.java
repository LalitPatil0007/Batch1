package stringfromjava;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PrintStringWithoutDuplicasy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Pune Pune Nashik Mumbai Mumbai Pune";       // Pune Nashik Mumbai
		String[] s1 = s.split(" ");  // s1 = {"Pune","Pune","Nashik","Mumbai","Mumbai","Pune"}
		
		Set<String> setOFString = new HashSet<String>(Arrays.asList(s1));
		//System.out.println(setOFString);
		
		String s3 = String.join(" ", setOFString);

		System.out.println(s3);
	}

}
