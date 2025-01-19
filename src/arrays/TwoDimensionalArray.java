package arrays;

public class TwoDimensionalArray {
	
	// Matrix array => array in which each row has same number of col

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int[][] a = new int [2][3]; // length 6 r = 2 => 0 , 1 // 3 => 0 , 1 ,2
		 * 
		 * a[0][0] = 10; a[0][1] = 20; a[0][2] = 30 ;
		 * 
		 * a[1][0] = 50; a[1][1] = 40; a[1][2] = 60;
		 */
		
		int[][] a = { {10,20,30} , {50,40,60}  };
		
		System.out.println(a); // class value for 2d array
		System.out.println(a[0]); // class value for 1d array
		System.out.println(a[1]); // class value for 1d array

		System.out.println(a[0][0]); // 10
		
		System.out.println(a[0].length);  // 2  => number of rows
		System.out.println(a[1].length);  // 3 => number of col  or length of 1d aarays 
		
		
		for(int i = 0 ; i<a.length ; i++) {
			for(int j = 0 ; j<a[i].length;j++) {
				System.out.println(a[i][j]);
			}
		}
		
		System.out.println("Jagged Array");
		
		int[][] b = { {10,20} , {50,40,60} , {70,80,90,110} };
		
		for(int x = 0 ; x < b.length ; x++) {
			for(int y = 0; y<b[x].length;y++) {
				System.out.print(b[x][y]+" ");
			}
			System.out.println();
		}

		
		
		
	}

}
