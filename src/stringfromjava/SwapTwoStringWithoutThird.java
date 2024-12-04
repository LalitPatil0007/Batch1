package stringfromjava;

public class SwapTwoStringWithoutThird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 20;
		int temp ;
		
		temp = a;
		a= b;
		b =temp;
		
		
		
		System.out.println("value of a "+a);
		System.out.println("value of b "+b);
		
		
		int c = 100;
		int d = 200;
		
		
		c = c + d;   // 300
		d = c - d;   // 300 -200 = 100
		c = c - d;   // 200
		
		System.out.println("value of c "+c);
		System.out.println("value of d "+d);
		
		
		
		
		String s1 = "Pune";
		String s2 = "Nashik";
		
		String s = "";
		
		s = s1;
		s1=s2;
		s2=s;
		
		
		System.out.println("value of s1 "+s1);
		System.out.println("value of s2 "+s2);
		
		
		
		String s3 = "Solapur";
		String s4 = "Kolhapur";
		
		s3 = s3+s4 ;  // SolapurKolhapur
		s4 = s3.substring(0,s3.length()-s4.length());
		s3 = s3.substring(s4.length());
		
	
		System.out.println("value of s3 "+s3);
		System.out.println("value of s4 "+s4);
		

	}

}
