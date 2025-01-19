package controlStatementsFlows;

public class WorkinDays {

	public static void main(String[] args) {
		
		
		for(int i = 1 ; i<=7 ;i++) {
			if(i==6 || i==7) {
				continue;
			}
			else {
				System.out.println("Working");
			}
		}
	}

}
