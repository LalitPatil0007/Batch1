package controlStatementsFlows;

import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {
		int whichDay ;
		System.out.println("which day you want");
		Scanner sc = new Scanner(System.in);
		whichDay = sc.nextInt();
		
		switch(whichDay){
		case 1 :
			System.out.println("Mon");
			break;
		case 2 :
			System.out.println("Tue");
			break;
		case 3 :
			System.out.println("Wed");
			break;
		case 4 :
			System.out.println("Thur");
			break;
		case 5 :
			System.out.println("Fri");
			break;
		case 6 :
			System.out.println("Sat");
			break;
		case 7 :
			System.out.println("Sun");
			break;
			default:
				System.out.println("Invalid day selection");
				break;
		}

	}

}
