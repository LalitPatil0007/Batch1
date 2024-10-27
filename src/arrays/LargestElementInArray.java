package arrays;

import java.util.Arrays;

public class LargestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] b = {3,4,1,5,6,7,10};
		
//		Arrays.sort(b);
//		System.out.println(b[b.length-1]);
		
		int max = b[0];
		
		for(int i = 0; i<b.length;i++) {
			if(b[i]>max) {
				max = b[i];
			}
		}

		System.out.println(max);
	}

}
