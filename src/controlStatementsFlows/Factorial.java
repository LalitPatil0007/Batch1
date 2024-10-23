package controlStatementsFlows;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberForWhichFactRequired ;
		int factorial=1;
		System.out.println("number for which factorial want");
		Scanner sc = new Scanner(System.in);
		numberForWhichFactRequired = sc.nextInt();
		
		for(int i = 1; i<=numberForWhichFactRequired;i++) {
			factorial = factorial*i;
		}
		System.out.println("Factorial is ");
		System.out.println(factorial);

	}

}
