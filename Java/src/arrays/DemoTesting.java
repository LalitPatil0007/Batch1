package arrays;

import java.util.HashSet;

public class DemoTesting {

	public static void main(String[] args) {
	
		
		String str = "Lalit Patil";
		String [] str1 = str.split(" ");

String rev ="";
		for(String s:str1) {
			String revw = "";
			for(int i = s.length()-1 ; i>=0;i--) {
				revw = revw+s.charAt(i);
			}
			rev = rev+revw+ " ";
		}
				
			System.out.println(rev.trim());	
		
	}

}
