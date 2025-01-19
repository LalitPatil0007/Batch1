package arrays;

public class DeleteElementFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {20,30,40,50,60};
		
		int elementDel = 40;
		
	  int[] requiredArray = new int [a.length-1] ;
	  
	  int indexZero = 0 ;
	  
	  for(int i = 0 ; i < a.length;i++) {
		  if(a[i]==elementDel) {
			  continue;
		  }
		  requiredArray[indexZero] = a[i];
		  indexZero++;
		  
	  }

	  
	  for(int z : requiredArray) {
		  System.out.println(z);
	  }
	  
		
		
	}
}
