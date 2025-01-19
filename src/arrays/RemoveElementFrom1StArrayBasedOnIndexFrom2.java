package arrays;

public class RemoveElementFrom1StArrayBasedOnIndexFrom2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3,4,5,6,7,8};
		
		int[] b = {2,3};
		
		int[] requiredArray = new int [a.length-b.length];
		
		int indexZero = 0;
		
		for(int i = 0;i<a.length ; i++) {
			
			boolean toremove = false;
			
			for(int j = 0;j<b.length; j++) {
				if(i==b[j]) {
					toremove = true;
					break;
				}
			}
			if(!toremove) {
				requiredArray[indexZero] = a[i];
				indexZero++;
			}
		}
		
		
		for(int z : requiredArray) {
			System.out.println(z);
		}
		
		

	}

}
