package controlStatementsFlows;

public class HollowRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int row = 0 ; row<=5 ; row ++) {
			for (int col = 0 ; col <=5 ; col ++) {
				if(row==0 || row == 5 || col == 0 || col == 5) {
					System.out.print("* ");
				}else {
				 System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
