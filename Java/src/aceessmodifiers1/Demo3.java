package aceessmodifiers1;

import accessmodifier.Demo1;

public class Demo3 extends Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 d1 = new Demo1();
		Demo1 obj = new Demo1();
		System.out.println(obj.age);
		System.out.println(obj.name);
		obj.m1();

		obj.m2();

		System.out.println(obj.sureName);
		System.out.println(obj.clgName);

		System.out.println(obj.clr);
		obj.pm();

		Demo3 d3obj = new Demo3();
		System.out.println(d3obj.clr);
		d3obj.pm();

	}

}
