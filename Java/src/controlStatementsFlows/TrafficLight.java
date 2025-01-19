package controlStatementsFlows;

import java.util.Scanner;

public class TrafficLight {

	public static void main(String[] args) {
		String color;
		Scanner sc = new Scanner(System.in);
		color = sc.next();
		switch(color) {
		case "yellow":
			System.out.println("slow down");
			break;
		case "red":
			System.out.println("stop");
			break;
		case "green":
			System.out.println("go");
			break;
			default:
				System.out.println("you have color blindness check color again");
				break;
		}
		

	}

}
