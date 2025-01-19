package oops;

public class SecondChild extends Parent{
	
public static void main(String[] args) {
	System.out.println("As second child class extends  parent class  it can  access parent class methods also ");
	firstMethodFromParent();
	secondMethodFromParent();
	System.out.println(parentName);
	System.out.println(parentHeight);
	
}

}
