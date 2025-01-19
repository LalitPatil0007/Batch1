package controlStatementsFlows;

public class HalfDiamond {

	public static void main(String[] args) {
    
		int dimension = 5;
		
		for(int row = 0 ; row<=dimension;row++) {
			for(int col = 0 ; col<=row;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int row = dimension ; row>0 ;row--) {
			for(int col = row ; col>0;col--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
