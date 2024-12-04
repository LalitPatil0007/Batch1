package stringfromjava;

public class PalindromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "radar";
		String rev = "";
		
		for(int i = s.length()-1;i>=0;i--) {
			rev = rev+s.charAt(i);
		}
		System.out.println(rev);
		if(rev.equals(s)) {
			System.out.println("String is palindrom");
		}else {
			System.out.println("String is not palindrom");
		}

	}

}
