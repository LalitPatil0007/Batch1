package controlStatementsFlows;

public class Palindrom {

	public static void main(String[] args) {
	    int number = 2123;
		int temp = number;
		int rem ;
		int rev = 0 ;
		
		
		while(temp>0) {
			rem = temp%10; 
			rev = rev*10+rem;
			temp=temp/10;
		}
		

		
		if(rev==number) {
			System.out.println("number is palindrom");
		}
		else {
			System.out.println(" numbver not palindrom");
		}
		
	}

}
