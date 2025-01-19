package controlStatementsFlows;

import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {
     int a ;
     int b ;
     int c ;
     
     Scanner sc = new Scanner(System.in);
     
     System.out.println("give value of a");
     a = sc.nextInt();
     System.out.println("give value of b");
     b = sc.nextInt();
     System.out.println("give value of c");
     c = sc.nextInt();
     
     if(a>b && a>c) {
    	 System.out.println("a larger");
     }
     else if(b>a && b>c) {
    	 System.out.println("b larger");
     }
     else {
     	 System.out.println("c larger");
     }

	}

}
