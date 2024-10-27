package arrays;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("which number you want to check for presence in the array");
		int numberToCheck = sc.nextInt();
		
		int[] z = {10,20,30,40,50,60,70,80};     // if all elements in array are unique and we want to check particular element present or not
		
		for(int x : z) {
			if(x==numberToCheck) {
				System.out.println(numberToCheck + " is Present in the array");
				break;
			}else {
				System.out.println("number not found");
			}
		}
		
		System.out.println("process completed");

	}

}
