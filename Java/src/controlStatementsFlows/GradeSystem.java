package controlStatementsFlows;

import java.util.Scanner;

public class GradeSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a ;
		System.out.println("give value of a");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		if(a>=70) {
			System.out.println("Grade A");
		}
		else if(a<70  && a>=50) {
			System.out.println("Grade B");
		}else  {
			System.out.println("Grade C");
		}

	}

}
