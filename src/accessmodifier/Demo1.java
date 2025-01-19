package accessmodifier;

 public class Demo1 {

	public String name = "PQRXYZ";
	public int age = 60;
	
	private String sureName = "Patil";
	private String clgName = "NWC";
	
	
	protected String clr = "Blue";
	
	protected void pm() {
		
		System.out.println("protected method got executed");
	}

	public void m1() {
		System.out.println("m1 executed ");
		age =50;
		System.out.println(age);
	}
	
	
	 void m2() {
		System.out.println("m2 executed ");
	}

	public static void main(String[] args) {

		Demo1 obj= new Demo1();
		System.out.println(obj.name);
		System.out.println(obj.age);
		obj.m1();
		obj.m2();
		System.out.println(obj.sureName);
		System.out.println(obj.clgName);
		
		System.out.println(obj.clr);
		obj.pm();
}

}