package encapsulation;

public class IDFCShivAccount {
private static int accountNumber  = 1234;
 private static int accountBalance = 12221;
 
 public static int getBalance() {
	 return accountBalance;
 }

 public static void setBalance(int amountToadd) {
	 accountBalance = accountBalance + amountToadd;
 } 

}
