package arrays;

public class OneDArraySearchOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] x = {5,6,4,8,2,3,9,1};
		
//		for(int i = 0 ; i<=x.length-1 ; i++) {
//			if(x[i]%2 != 0 ) {
//				System.out.println(x[i]);
//			}
//		}
		
		for(int y : x) {
			if(y%2 != 0) {
				System.out.println(y);
			}
		}

	}

}
