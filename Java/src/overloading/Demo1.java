package overloading;

public class Demo1 {
	// overloading
	public void sum(int firstNum , int secNum) {
		int sum = firstNum + secNum;
		System.out.println(sum);
		System.out.println("Executed int int method");
	}
	
	public void sum(float firstNum , float secNum) {
		float sum = firstNum + secNum;
		System.out.println(sum);
		System.out.println("Executed float float method");

	}
	
	public void sum(float firstNum , int secNum) {
		float sum = firstNum + secNum;
		System.out.println(sum);
		System.out.println("Executed float int method");
	}

	public void sum(int firstNum , float secNum) {
		float sum = firstNum + secNum;
		System.out.println(sum);
		System.out.println("Executed int float method");
	}
	
	public void printName(String firstName, String lastName) {
		System.out.println(firstName + " " + lastName);
	}
	
	public void printName(String firstName, String middle, String lastName) {
		System.out.println(firstName +" "+middle+ " " + lastName);
	}
	
	
	
	public int multiplication(int num1 , int num2) {
		int mult = num1*num2;                                   // method with exact same parameter but different return type can cause ambiguity to compiler => hence not possible to achieve overloading in this case
		return mult;
	}
	
	public float multiplication(int num1 , int num2) {
		float mult = num1*num2;
		return mult;
	}

	
	public float multiplication(float num1 , int num2) {
		float mult = num1*num2;                                   // method should atleast differ in parameter or order or number of parameter also different return type can be 
		return mult;
	}
	
	public float multiplication(int num1 , float num2) {
		float mult = num1*num2;
		return mult;
	}
	
	
	public void showNumber(float dbl) {
		
		System.out.println("number is int method");
		System.out.println(dbl);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 d = new Demo1();
		d.sum(10, 10);
		d.sum(20.0f, 20.0f);
		d.sum(20f, 30);
		d.sum(200, 30f);
		d.printName("Lalit","Patil");
		d.printName("Lalit","Santosh","Patil");
		
		d.multiplication(10, 20);
		
		
		d.showNumber(10);
		
		byte b = 101;
		short s = 111;
		int i = 1000;
		double dbl = 10.00;
		
		d.showNumber(b);
		d.showNumber(s);
		d.showNumber(i);
		d.showNumber(dbl);       // higher data type cant be stored in lower
		
		

	}

}
