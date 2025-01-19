package arrays;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("which number you want to check for presence in the array");
		int numberToCheck = sc.nextInt();
		
		int[] z = {10,20,30,40,50,60,70,80};     // if all elements in array are unique and we want to check particular element present or not
		
		boolean numberPresent = false;
		for(int x : z) {
			if(x==numberToCheck) {
				numberPresent = true;
				break;
			}
		}
		if(numberPresent) {
			System.out.println("numberPresent");
		}else {
			System.out.println("numberNotPresent");
		}
	

	}

}
