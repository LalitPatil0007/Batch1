package arrays;

public class CopyOneArrayToAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3,4};
		int[] b = new int[a.length];
		
		System.arraycopy(a, 0, b, 0, b.length);
		
//		for(int i = 0 ;i<a.length ; i++) {
//			b[i] = a[i];
//		}
//		
//		
		for(int x : b) {
		  System.out.println(x);
		}
		
	}

}
