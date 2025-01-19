package abstraction;

public class Execution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank javalaBazarHDFC = new HDFCBank(1020,"javalaBazarHDFC");
		
		
		javalaBazarHDFC.depositMoney(500);
		javalaBazarHDFC.withdrawMoney(200);
		javalaBazarHDFC.checkBalance();
		javalaBazarHDFC.printName();
		
		System.out.println(javalaBazarHDFC.ifsc);
		System.out.println(javalaBazarHDFC.branchName);

	}

}
