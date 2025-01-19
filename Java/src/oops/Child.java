package oops;

public class Child extends Parent{
	
	public static  void firstMethodFromChild() {
		System.out.println("This is 1st method from Child class ");
	}
	
	public static void secondMethodFromChild() {
		System.out.println("This is 2st method from Child class ");
	}

	public static void main(String[] args) {
		System.out.println("child class can access its own methods");
		firstMethodFromChild();
		secondMethodFromChild();
		
		System.out.println("");
		
		System.out.println("As child class extends  parent class  it can  access parent class methods");
		firstMethodFromParent();
		secondMethodFromParent();
		System.out.println(parentName);
		System.out.println(parentHeight);
		
		System.out.println("");
		System.out.println("As child class extends  parent class and parent class extends grand parent so  it can  access grand parent class methods also");
		firstMethodFromGrandParent();
		secondMethodFromGrandParent();

	}

}
