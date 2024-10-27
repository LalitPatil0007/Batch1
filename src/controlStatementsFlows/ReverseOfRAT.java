package controlStatementsFlows;

public class ReverseOfRAT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dimension = 5;
		
		
		for(int row = 1 ; row<=dimension ; row++) {
			for(int col=dimension; col>=row;col--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
