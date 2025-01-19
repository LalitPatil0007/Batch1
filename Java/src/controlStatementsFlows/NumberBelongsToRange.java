package controlStatementsFlows;

public class NumberBelongsToRange {

	public static void main(String[] args) {
		int lowerLimit = 5;
		int upperLimit = 10;
		int numberToCheck = 12;
		
		if(numberToCheck>lowerLimit && numberToCheck<upperLimit) {
			System.out.println("number "+numberToCheck + " belongs to given range");
		}else {
			System.out.println( "num doesnt belongs to given range");
		}
		

	}

}
