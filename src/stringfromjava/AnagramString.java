package stringfromjava;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Listen";
		String s1 = "silent";
		
		char[] c = s.toCharArray();
		char[] c1 = s1.toCharArray();
		
		Arrays.sort(c);
		Arrays.sort(c1);
		
		if(Arrays.equals(c,c1)) {
			System.out.println("Strings are anagram");
		}
		else {
			System.out.println("Strings are not anagram");
		}

	}

}
