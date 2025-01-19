import java.util.ArrayList;

public class wrapperClasses {
	
	public static void print() {
		System.out.println("Hi");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//autoboxing  =>converting primitive type of data to its corresponding wrapper class object
		// unboxing    => converting wrapperclass object to its corresponding primitive data type
	
		
		int i = 10;
		Integer x = i ;         // autoboxing
		
		
		Integer y =20 ;
		int c = y ;        // unboxing
		
		
		Integer z = new Integer(10);
		int z1 = z;
		
	
		
		int i1 = 20;
		int i2 = 10;
		int i3 = 30;
		
		
		
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(i1);
		al.add(i2);
		al.add(i3);                          // autoboxing
		
		
		
		//System.out.println(al);
		
//		boolean -> Boolean     skip 
//		byte  -> Byte
//		char   -> Character
//		short   -> Short
//		int    -> Integer
//		long  -> Long
//		float  -> Float
//		double  -> Double
		
		// Byte Wrapper class methods 
		
		Byte b = new Byte((byte) 10);
		Byte b1 = 20;
		Byte b2 = 40;
		
		System.out.println(b1.compareTo(b2));
		System.out.println(b2.compareTo(b1));
		
		byte b3 = 10;
		byte b4 = 40;
		byte b5 = 40;
		
		System.out.println(Byte.compare(b3, b4));
		System.out.println(Byte.compare(b4, b3));
		System.out.println(Byte.compare(b4, b5));
		
		
		String theValueOfByte = "12";
		System.out.println(theValueOfByte+20);
		byte b7 = Byte.parseByte(theValueOfByte);   // String to byte 
		System.out.println(b7+20);
		
		byte b6 = 40;
		System.out.println(b6+20);
		String valueOfB6 = Byte.toString(b6);     // byte to String
		System.out.println(valueOfB6+20);
		
		String theValueOfByte1 = "30";
		Byte wbyteValue = Byte.valueOf(theValueOfByte1);   //String to Byte
		
		
		

		
		int j = 21;
		String stringValueOfJ = Integer.toString(j);
		System.out.println(stringValueOfJ+20);
		
		String strValue = "2021";
		int intValueOf2021 = Integer.parseInt(strValue);
		System.out.println(intValueOf2021+10);
		
		Integer INTVALUEOF2021 = Integer.valueOf(strValue);
		System.out.println(INTVALUEOF2021.compareTo(INTVALUEOF2021));
		
		int j1 = 10;
		int j2 = 20;
		
		System.out.println(Integer.compare(j1, j2));
		
		System.out.println(Integer.max(j1, j2));
		
		System.out.println(Integer.min(j1, j2));
		
		System.out.println(Integer.sum(j1, j2));
		


		char c11 = 'c';
		char c12 = Character.toUpperCase(c11);
		System.out.println(Character.isDigit(c11));
		System.out.println(c12);
		
		String s = "true";
		boolean b123 = Boolean.parseBoolean(s);
		if(b123) {
			System.out.println("boolean");
		}
		else {
			System.out.println("not boolean");
		}
		
		boolean t12 = true;
		String valueOft12 = Boolean.toString(t12);
		System.out.println(valueOft12+132);


	}

}
