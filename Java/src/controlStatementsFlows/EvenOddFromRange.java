package controlStatementsFlows;

public class EvenOddFromRange {

	public static void main(String[] args) {
		for(int i =1 ; i<=30;i++) {
			if(i%2==0) {
				System.out.println(i+" is even");
			}
		}
		for(int i =1 ; i<=30;i++) {
			if(i%2!=0) {
				System.out.println(i+" is odd");
			}
		}

	}

}
