package abstraction;

public abstract  class Bank {
	int ifsc ;
	String branchName;
	    abstract void depositMoney(double amount);   // method without body/implementation called abstract method
	    abstract void withdrawMoney(double amount);
	    abstract void checkBalance();
	    
	    void printName() {
	    	System.out.println("name");    // concrete method
	    }
	    
	    Bank(int ifsc, String branchName){
	    	this.ifsc = ifsc;
	    	this.branchName= branchName;
	    }
}
