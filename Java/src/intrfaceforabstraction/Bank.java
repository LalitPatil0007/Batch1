package intrfaceforabstraction;

public interface Bank {

     void depositMoney(double amount);   // method without body/implementation called abstract method
     void withdrawMoney(double amount);
     void checkBalance();
    

     
     Bank(){
    	 
     }
    
    
	 default void methodOne() {
		System.out.println("name");            // allows concrete method also 
	} 
	

    int x=10;                               // variables by default => public static final   => as its final => value need to intialized while declaration => no further change possible to this variables as this are final => constructors are not available

   



}
