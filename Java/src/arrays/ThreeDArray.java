package arrays;

public class ThreeDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][][] x =    {    {  {10,20} , {30,40}   }  , {  {50,60} ,  {70,80}  }     } ;
		System.out.println(x.length);
		System.out.println(x[0].length);
		System.out.println(x[0][0].length);
		System.out.println(x[0][0][0]);
	
		
		
		System.out.println("Elements retrived");
		int count = 0;
		
		for(int i = 0 ; i<x.length;i++) {
			for(int j = 0 ; j<x[i].length;j++) {
				for(int k = 0 ; k<x[i][j].length;k++) {
					System.out.println(x[i][j][k]);
					count++;
				}
			}
		}


		System.out.println("total elements in array "+ count);
	}

}
