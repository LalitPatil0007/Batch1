package arrays;

public class InsertWithoutLoosingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3,4,5,6};       
		int indexPosition = 2;          
		int toAdd = 50;
		
		int[] requiredArr = new int[a.length+1];
		
		for(int i = 0 ; i < indexPosition;i++) {
			requiredArr[i] = a[i];
		}
		
		requiredArr[indexPosition] = toAdd;
		
		for(int i = indexPosition ; i < a.length;i++) {
			requiredArr[i+1] = a[i];
		}
		
		
		for(int c : requiredArr) {
			System.out.println(c);
		}
		

	}

}
