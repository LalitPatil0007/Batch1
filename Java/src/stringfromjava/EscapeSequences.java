package stringfromjava;

public class EscapeSequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// lalit "Hi"  
		String s = "lalit \"Hi\"";
		System.out.println(s);
		
		String s1 = " lalit 'Hi'";
		System.out.println(s1);

//		\n  , \t ,\b
		
		String s4 = "\\\\lalit";
		System.out.println(s4);
		
		String s5 = "Hi\n Hello";
		System.out.println(s5);
		
		String s6 = "hello\tbye";
		System.out.println(s6);
		
		String s7 = s5.replaceAll("\n", "");
		System.out.println(s7);
		
		String s9 = "\"Hello\"";
		System.out.println(s9);
		
		
		
		

		
	}

}
