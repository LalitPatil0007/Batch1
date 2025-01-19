package stringfromjava;

public class CountOccuranceOfParticularChar {
	static char x;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Claaasss";
		String c = "a";
		
		String str1 = str.replaceAll(c,"");  //Clsss
		
		int occurance = str.length()- str1.length();
		
		System.out.println("occurance of "+c+" is: "+occurance);
		
		System.out.println("____________________________________________________________");
		String str2 = "Claaasss";
		
		int count = 0;
		
		char charToCheck = 'l';
		
		for(int i=0;i<str2.length();i++) {
			if(str2.charAt(i)==charToCheck) {
				count++;
			}
		}

		System.out.println("occurance of "+charToCheck+" is: "+count);
		
		System.out.println(x);
	}
	
	

}
