package controlStatementsFlows;

public class ToCheckNumberIsPrime {

	public static void main(String[] args) {

		int number = 11;
		int count = 0;
		
		
		if(number>1) {
			for(int i = 1;i<number;i++) {
				if(number%i==0) {
					count++;
				}
			}
			if(count>1) {
				System.out.println(number+" no prime");
			}
			else {
				System.out.println(number+" is prime ");
			}
		}else {
			System.out.println(number +" is non prime ");
		}
		
	}

}
