package oops;

 class Parent extends GrandParent {
	static int  parentHeight = 12345;
	static String parentName ="XYZPQR";

	public static void firstMethodFromParent() {
		System.out.println("This is 1st method from parent class ");
	}
	
	public static void secondMethodFromParent() {
		System.out.println("This is 2st method from parent class ");
	}
	
	public static void main(String[] args) {
		firstMethodFromParent();
		secondMethodFromParent();
		
		firstMethodFromGrandParent();
		secondMethodFromGrandParent();
	}
}
