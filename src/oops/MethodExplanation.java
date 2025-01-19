package oops;

public class MethodExplanation {
	
	//method => return type , parameterized method
	
	
	 public void printHello() {
		 System.out.println("Hello");
		 System.out.println("Hi");
		 System.out.println("Hey");
	 }
	 
	 public void writeTheTextInConsole(String textToWrite) {
		 System.out.println(textToWrite);
	 }
	 
	 public void printAddition(int firstNumber, int secondNumber) {
		 int sum = firstNumber+secondNumber;
		 System.out.println(sum);
	 }
	 
	 
	 public int returnSum(int firstNumber, int secondNumber) {
		int sum = firstNumber+secondNumber;
		return sum;
	 }
	 

	public static void main(String[] args) {
		MethodExplanation m1 = new MethodExplanation();
		m1.printHello();
		MethodExplanation m2 = new MethodExplanation();
		m2.printHello();
		
		m1.writeTheTextInConsole("m1 writting hello");
		m1.writeTheTextInConsole("m1 writting Hi");
		m2.writeTheTextInConsole("m2 says stop");
		
		
		m1.printAddition(20, 30);    // no return type => just print sum => no further operation can be performed on the output of this method
		
		
		int afterAdding50 = m1.returnSum(50,50)  + 50;  // int return type => further operation can be performed as returns sum output 
		
		System.out.println(afterAdding50);
	
		
		
		
		
	}

}
