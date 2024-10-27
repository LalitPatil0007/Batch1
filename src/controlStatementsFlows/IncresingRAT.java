package controlStatementsFlows;

public class IncresingRAT {

	public static void main(String[] args) {

		int dimension = 4;
		int num = 0;
		for(int row = 1 ; row <= dimension ; row++) {
			
			
			for(int col = 1 ; col <= row ; col++) {
				System.out.print(num + "    ");
				num++;
			}
			
			System.out.println();
			
			
			
			
		}
	}

}
