package arrays;

import java.util.Arrays;

public class NthLargestKthSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] z = {4,5,7,8,9,10};
		
		Arrays.sort(z);
		   System.out.println(" largest element "+ z[z.length-1]);
	    System.out.println("Second largest element "+ z[z.length-2]);
	    System.out.println("smallest element "+ z[0]);
	    System.out.println("2nd smallest element "+ z[1]);
	    System.out.println("3nd smallest element "+ z[2]);

	}

}
