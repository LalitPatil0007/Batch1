package arrays;

public class InsertElementFromArray {

	public static void main(String[] args) {

		// insert an element in array at particular position 
		
		int[] y = {10,20,30,40,50,60};
		int indexPosition = 3;   
		int numberToInsert = 100;
		
		for(int i = y.length-1 ; i > indexPosition ; i--) {
			y[i] = y[i-1];
		}
		y[indexPosition] = numberToInsert;
		
		
		for(int j = 0 ;j<y.length;j++) {
			System.out.println(y[j]);
		}
	
		
		
	}

}
