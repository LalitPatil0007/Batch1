package stringfromjava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class CountOccuranceOfEachCharFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "AAABBB CCCDDDDD EEE EEFFFFFFF";
		int count =0;

		ArrayList<Character> al = new ArrayList<Character>();  // char[] c = {'A','B','C','D','E','F'};
		
		// add => elemnet add  , contains => checks whether that element is present in list or not , size()		
		

		for(int i = 0;i<s.length();i++) {
			char charToadd = s.charAt(i);
			// add char if its not a space and it should not be already present in list
			if(!al.contains(charToadd) && charToadd != ' ') {
			al.add(charToadd);
			}
		}
		
		
		for(int i = 0 ; i<al.size();i++) {
			char charFromList = al.get(i);   // for i=0 charFromList=A
			
			for(int j=0 ;j<s.length();j++) {
				if(charFromList==s.charAt(j)) {
					count++;
				}
			}
			System.out.println(charFromList+" occured "+count+" times");
			count = 0;
		}
		
	
	}

}
