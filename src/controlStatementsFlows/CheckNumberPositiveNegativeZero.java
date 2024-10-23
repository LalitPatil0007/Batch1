package controlStatementsFlows;

import java.util.Scanner;

public class CheckNumberPositiveNegativeZero {

	public static void main(String[] args) {
		int a ;
		System.out.println("give value of a");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		if(a>0) {
			System.out.println("a +ve");
		}
		else if(a<0) {
			System.out.println("a -ve");
		}
		else {
			System.out.println("a is 0");
		}
		

		
		
	}

}
