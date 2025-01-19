package overriding;

public class Parent {
	
	String variableFromParent = "variableFromParent";
	
	 public void printName(String textToPrint) {
		System.out.println("Method From Parent Class and printing : "+textToPrint);
	}
	 
	public final void thisIsFinalMethod() {
		System.out.println("This is final method from parent class");
	}
	
	public Number m1(Integer i, Integer j) {
		return i+j;
	}
	
	
	public Object show(String s) {
		return s;
	}


}
