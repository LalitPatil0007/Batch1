package arrays;

public class FindMissingFromSortedArray {

	public static void main(String[] args) {
		
		int[] x = {5,6,9,10};
		
		int actualSum = 0;
		int totalSum = 0;
		
		for(int i = 0 ; i<x.length;i++) {
			actualSum = actualSum + x[i];     // actual array number sum   5 + 6+7+8+10
		}
		
		for(int j=5;j<=10;j++) {
			totalSum = totalSum + j;     // 5 + 6+7+ 8+ 9+10
		}
		
		int sumOfTwoMissing = totalSum - actualSum;
		int firstMissing = sumOfTwoMissing /2 ;
		int secondMissingNumber = sumOfTwoMissing - firstMissing;
		
		System.out.println("first missing number "+firstMissing  + " Second Number " +secondMissingNumber );
		
		
	}

}
