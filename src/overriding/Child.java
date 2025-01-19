package overriding;

public class Child extends Parent {
	
	// private < default < protected < public
	@Override
	public void printName(String name){
		System.out.println("Method From Child Class and printing : "+name);
	}
	
	public void printParent(String text) {
		super.printName(text);
		System.out.println(	super.variableFromParent);
	}
	
//	@Override
//	public final void thisIsFinalMethod() {
//		System.out.println("This is final method from child class");
//	}


	
	@Override
	public String show(String s) {
		return s;
	}
	
	@Override
	public Integer m1(Integer i,Integer j) {
		return i*j;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.printName("XYZAAD");
		
		System.out.println(c.variableFromParent);
		
		Parent p = new Parent();
		p.printName("BSBABJHb");
		
		Parent p1 = new Child();
		p1.printName("kdsjhdsd");
		
		System.out.println(p1.variableFromParent);
		
		c.printParent("dhjjkdhsjkd");
		
		System.out.println(p.m1(10,20));
		System.out.println(c.m1(10,20));
	
		
		Integer i = new Integer(0);
		
		Short s = new Short((short) 0);
		

		// Child d = new Parent();     not possible 
	}

}
