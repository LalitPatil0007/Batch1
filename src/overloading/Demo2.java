package overloading;

public class Demo2 {
	
	static {
		main("name");
		String[] strArr = {"str1","str2","str3"};
		main(strArr);
	}

	public static void main(String[] args) {
		System.out.println("main with string args");

	}
	
	public final static void main(int x) {
		System.out.println(x);
	}
	
	public  static void main(String s) {
		System.out.println(s);
	}


}
