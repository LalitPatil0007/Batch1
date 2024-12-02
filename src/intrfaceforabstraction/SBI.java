package intrfaceforabstraction;

public class SBI implements Bank{

	private double balance = 1000.00;
	
    @Override
	public void depositMoney(double amount) {
        balance = balance+ amount;
        System.out.println("Deposit Successful. Updated Balance: " + balance);
    }

    @Override
    public void withdrawMoney(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawal Successful. Updated Balance: " + balance);
        } else {
            System.out.println("Insufficient Funds.");
        }
    }

    @Override
   public void checkBalance() {
        System.out.println("Available Balance: " + balance);
    }
    

     
    
}
