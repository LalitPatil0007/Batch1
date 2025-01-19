package controlStatementsFlows;

import java.util.Scanner;

public class PrintPrimeFromRange {
	
	public static void main(String[] args) {
		
		int lowerLimit ;
		int upperLimit ;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Give lower limit");
		lowerLimit = sc.nextInt();
		System.out.println("Give upper limit");
		upperLimit = sc.nextInt();
		
		for(int j = lowerLimit; j<=upperLimit;j++) {
			
			int count = 0;
			if(j>1) {
				for(int i = 1;i<j;i++) {
					if(j%i==0) {
						count++;
					}
				}
				if(count>1) {
					System.out.println(j+"is no prime");
				}
				else {
					System.out.println(j+" is prime ");
				}
			}else {
				System.out.println(j +" is non prime ");
			}
			
			
		}
		
	}

}
