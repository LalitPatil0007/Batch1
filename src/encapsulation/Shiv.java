package encapsulation;

public class Shiv  {

	public static void transferBalance(int accountNumber) {
		
		
	}
	
	public static void main(String[] args) {
		IDFCShivAccount myaccount = new IDFCShivAccount();
		System.out.println(myaccount.getBalance());
		myaccount.setBalance(100);
		System.out.println(myaccount.getBalance());
		
		transferBalance(myaccount.accountNumber);
	}
	

	
	
	

	
}
