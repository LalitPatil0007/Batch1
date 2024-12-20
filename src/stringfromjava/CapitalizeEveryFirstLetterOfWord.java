package stringfromjava;

import java.lang.reflect.Array;

public class CapitalizeEveryFirstLetterOfWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "hi hello bye";
		String[] s1 = s.split(" ");   //s1 = {"hi","hello","bye"}
		String req = "";
		
		for(int i =0 ;i<s1.length;i++) {
			String word = s1[i];    // i =1   => hello
			String fistLetter =  word.substring(0,1).toUpperCase();  
			String remainString = word.substring(1);    
			req = req+fistLetter+remainString+" ";  
		}
		
		System.out.println(req.trim());
		
		System.out.println("_______________________________________________________ ");
		String s2 = "hi hello bye";
		String[] s3 = s2.split(" "); 
		String req1 = "";
		
		for(int i =0 ;i<s1.length;i++) {
			String word = s1[i];    // i =1   => hello
			String lastLetter =  word.substring(word.length()-1).toUpperCase();  
			String remainString = word.substring(0,word.length()-1);    
			req1 = req1+remainString+lastLetter+" ";  
		}
		System.out.println(req1.trim());
	}

}
