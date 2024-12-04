package stringfromjava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class CountOccuranceOfEachCharFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "AAABBB CCCDDDDD EEE EEFFFFFFF";
		int count =0;

		ArrayList<Character> al = new ArrayList<Character>();

		for (int i = 0; i < s.length(); i++) {
			if (!al.contains(s.charAt(i)) && s.charAt(i) != ' ') {
				al.add(s.charAt(i));
			}
		}


		for(int j=0;j<al.size();j++) {
			for(int i = 0;i<s.length();i++) {
				if(al.get(j)==s.charAt(i)) {
					count++;
				}
			}
			System.out.println(al.get(j)+" ocuured "+count+" times");
			count=0;
		}
		
		
		
	}

}
