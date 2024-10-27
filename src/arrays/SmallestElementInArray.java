package arrays;

import java.util.Arrays;

public class SmallestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {6,5,4,6,1};
//		
//		Arrays.sort(a);
//		System.out.println(a[0]);
//      
		int min = a[0];  //6
		
		for(int i = 0 ; i < a.length; i++) {
			if(a[i]<min) {
				min = a[i];
			}
		}
		
		System.out.println(min);
		
		
	}

}
