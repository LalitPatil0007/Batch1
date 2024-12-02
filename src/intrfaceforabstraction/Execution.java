package intrfaceforabstraction;

public class Execution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank sbibranch1 = new SBI();
		
		sbibranch1.depositMoney(10000);
		sbibranch1.withdrawMoney(5000);
		sbibranch1.checkBalance();
		
		Bank.methodOne();
		
		System.out.println(sbibranch1.x);
		sbibranch1.x =20;

	}

}
