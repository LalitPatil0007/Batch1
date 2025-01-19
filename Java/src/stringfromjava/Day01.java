package stringfromjava;

public class Day01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String  s = new String("lalit");  
		String s1 = "patil";
		StringBuffer b = new StringBuffer("Hi Hello Hey");
		StringBuilder sb = new StringBuilder("patil");
		
		String s2 = "Hi Hello";
		
		System.out.println(s2.charAt(7));
		System.out.println(s2.concat(" Hey"));
		s2 = s2.concat(" Hey");   // s2 = Hi Hello Hey
		System.out.println(s2);
		System.out.println(s2.contains("hey"));
		System.out.println(s2.contentEquals("Hi Hello"));
		System.out.println(s2.contentEquals(b));
		System.out.println(s2.endsWith("He"));
		System.out.println(s2.endsWith("Hey"));
		System.out.println(s2.equals("Hi Hello Hy"));                     //  ==   ,,, .equals();
		System.out.println(s2.equalsIgnoreCase("Hi heLLO hey"));
		System.out.println(s2.indexOf("elo"));

		
		String s3 = "";
		System.out.println(s3.isBlank());
		
		System.out.println(s3.isEmpty());
		
		
		System.out.println(s2.lastIndexOf("e"));      
		
		System.out.println(s2.length());
		
		System.out.println(s2.matches(""));
		

		String s5 = "Hi  Hi Hi Hello Hello Hey Byee Byee";
		
		System.out.println(s5.replace("H","XYZ"));
		
		System.out.println(s5.replaceAll("Hi","ABC"));
		
		String s6 = "a      bcd            efg    ";
		System.out.println(s6.replaceAll("\\s+"," "));
		
		
		String s7 = "abc #$%^ efg 0982";
		System.out.println(s7.replaceAll("[^a-zA-Z0-9]"," ")); 
		String s8 = (s7.replaceAll("[^a-zA-Z0-9]"," ")).replaceAll("\\s+"," ");   
		
		System.out.println(s8);
		
		
		String s9 = "xyz abc pqr";
		System.out.println(s9.replaceAll("[abc]", "****"));   
		
		
		
		String s10 = " xyz     pqr  xabxcy  nytss  xzzzy";    /// String should start with x and end with y  => replace them with #   
		System.out.println(s10.replaceAll("\\bx\\w*y\\b","#"));  //  => \\bx\\w* y\\b
		
		
		String arr[] = {"xyz","pqr","xabxcy","nytss","xzzzy"};
		
		for(int i=0 ;i<arr.length;i++) {
			if(arr[i].matches("\\bx\\w*y\\b")) {
				System.out.println(arr[i]);
				}
		}
		
		String s11 = "abc xyz abc pqr";
		String[] arr1 = s11.split(" ");   //String arr[] = {"abc","xyz","abc","pqr"};
		
		for(String p:arr1) {
			System.out.println(p);
		}
		String s12 = "abc,xyz,abc,pqr";
		String[] arr2 = s12.split(",");   //String arr[] = {"abc","xyz","abc","pqr"};
		
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		
		
		
		// array.length  => variable for arrays which gives size of array 
		// str.length() => method gives size string
		
		String s13 = "abcxyzabcpqr        ";
		
		System.out.println(s13.startsWith("abcy"));
		
		System.out.println(s13.startsWith("c", 2));
		
		// System.out.println(s13.strip());
		
	
		
		
		String s14 = "Hello World Hi There";
		
		System.out.println(s14.substring(6));   // Beginning index position will also considered
		
		System.out.println(s14.substring(6, 11));  // beginning index will be considered will return string uptill endindex-1 position
		
		System.out.println(s14.subSequence(6, 11));   
		
		
		
		String s15 = "Hello";
		char[] c = s15.toCharArray();   // char[] c = {'H','e','l','l','o'};
		
		for(int x=0;x<c.length;x++) {
			System.out.println(c[x]);
		}
		
	
		String s16 = "hello";
		System.out.println(s16.toUpperCase());
		

		String s17 = "hHELLO";
		System.out.println(s16.toLowerCase());
		
		String s18 = " abd   shshj jsjsj      ";
		System.out.println(s18.trim());
		
		String s19 = "lalit";
		String s20 = "patil";
		
		System.out.println(s19.concat(s20));
		System.out.println(s19+(s20));
		
		int m = 2000;
		
		System.out.println(s19+m);
		
		System.out.println(m+s19);
		
		String name = "XYZYAY";
		String midName = "DAHJADJH";
		String surNAme = "AKDhadh";
		
		String fullName = String.join("##", name,midName,surNAme);
		System.out.println(fullName);
		
		
		
	

	}

}
