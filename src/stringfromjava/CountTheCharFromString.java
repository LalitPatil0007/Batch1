package stringfromjava;

public class CountTheCharFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "TODO Auto-generated method stub";
		System.out.println(s.length());
		s = s.replaceAll("[^a-zA-Z]", "");	
		System.out.println(s.length());
		// totalChar = length - number of spaces in string
		// take counter increase counter if its not a space
		// replcae " " with "" => string.length 
		
		String s1 = "TODO Autogenerated method stub";
		int count = 0;
		
		for(int i=0;i<s1.length();i++) {
			if(!(s1.charAt(i)==' ')) {
				count++;
			}
		}
		
		System.out.println(count);
		
		
		

	}

}
