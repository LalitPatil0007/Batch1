package arrays;

public class OneDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a ;
		a = new int[5];
		a[0] = 10;
		a[1] = 20; 
		a[2] = 30 ;                 // start index = 0  , lastIndexPosition = size - 1;
		a[3] = 40;
		a[4] = 50;
		
		int[] b = {4,5,6,7,8,9,7,8};
		
		int[] c = new int[] {5,6,7,8,9,10};
		
		
		 // System.out.println(b[2]);     // 6
		
		for(int i = 0; i<a.length ; i++) {
			System.out.println(a[i]);
		}
		
		for(int x :  b) {
			System.out.println(x);
		}
		
		
		
		
		char[] char1 = {'a','b','c','d','x','y','z'};
		
		for(int i=0;i<char1.length;i++) {
			System.out.println(char1[i]);
		}
		
		for(char y : char1) {
			System.out.println(y);
		}
		
		String[] str1 = {"xyz","pqr","stq"};
		
		
		
		for(int i=0;i<str1.length;i++) {
			System.out.println(str1[i]);
		}
		
		for(String y : str1) {
			System.out.println(y);
		}
		
		
		
	//	System.out.println(b[b.length]);  // b.length == b[8]      => outofbound exception
		 
		
		

	}

}
