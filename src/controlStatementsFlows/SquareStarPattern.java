package controlStatementsFlows;

import java.util.Scanner;

public class SquareStarPattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Give dimension of square ");
		int dimension = sc.nextInt();

	for(int row = 1 ; row <= dimension ; row++) {
		
		
		for(int col = 1 ; col <= dimension ; col++) {
			System.out.print("* ");
		}
		
		System.out.println();
		
		
		
		
	}
}
}
