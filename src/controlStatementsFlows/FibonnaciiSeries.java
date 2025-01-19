package controlStatementsFlows;

public class FibonnaciiSeries {

	public static void main(String[] args) {

		int firstNo =0;
		int secondNo = 1;
		System.out.println(firstNo);
		System.out.println(secondNo);
		
		for(int i =2 ;i<=10;i++) {
		int	sum = firstNo+secondNo;
		System.out.println(sum);
			firstNo = secondNo;
			secondNo = sum;
		}
		
	}

}
