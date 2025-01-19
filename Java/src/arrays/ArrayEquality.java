package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayEquality {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5}; 
		
		int[] b = {1,2,3,4,5}; 
		
		// using predefined method 
		
//		boolean statusOfEquality = Arrays.equals(a, b);
//		
//		if(statusOfEquality) {
//			System.out.println("arrays are equal");
//		}else {
//			System.out.println("arrays not equal");
//		}
		
		// without using predefined method 
		
		boolean statusOfEquality = true;
		
		if(a.length == b.length) {
			
			for(int i = 0 ; i < a.length ; i++) {
				if(a[i] != b[i]) {
					statusOfEquality = false;
					break;
				}
			}
			
			if(statusOfEquality == false) {
				System.out.println("Arrays Not equal");
			}
			else {
				System.out.println("Arrays equal");
			}
			
		}else {
			System.out.println("Arrays not equal");
		}

	}

}
