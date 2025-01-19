package abstraction;

public class HDFCBank extends Bank {
	 
	HDFCBank(int ifsc, String branchName) {
		super(ifsc, branchName);
		// TODO Auto-generated constructor stub
	}

	private double balance = 1000.00;

	    @Override
	    void depositMoney(double amount) {
	        balance = balance+ amount;
	        System.out.println("Deposit Successful. Updated Balance: " + balance);
	    }

	    @Override
	    void withdrawMoney(double amount) {
	        if (amount <= balance) {
	            balance = balance - amount;
	            System.out.println("Withdrawal Successful. Updated Balance: " + balance);
	        } else {
	            System.out.println("Insufficient Funds.");
	        }
	    }

	    @Override
	    void checkBalance() {
	        System.out.println("Available Balance: " + balance);
	    }
	    
}
