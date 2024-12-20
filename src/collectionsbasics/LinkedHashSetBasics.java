package collectionsbasics;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet lhst = new LinkedHashSet();
		lhst.add("HI");
		lhst.add("HI");
		lhst.add("HI");
		lhst.add("Hey");
		lhst.add("Hey");
		lhst.add("Hello");
		lhst.add("Haaa");
		lhst.add("Hdmsmd");
		lhst.add("Hadknkd");
		lhst.add("Absbd");
		lhst.add("Possdwsnm");
		
		System.out.println(lhst);
		
		
		HashSet hst = new HashSet();
		hst.add("HI");
		hst.add("HI");
		hst.add("HI");
		hst.add("Hey");
		hst.add("Hey");
		hst.add("Hello");
		hst.add("Haaa");
		hst.add("Hdmsmd");
		hst.add("Hadknkd");
		hst.add("Absbd");
		hst.add("Possdwsnm");
		
		System.out.println(hst);
		
		TreeSet tst = new TreeSet();
		tst.add('P');
		tst.add('Q');
		tst.add('S');
		tst.add('A');
		tst.add('X');
		tst.add('B');
		tst.add('a');
		tst.add('b');
		tst.add('x');
		tst.add('P');
		tst.add('Q');
		tst.add('S');
		tst.add('A');
		tst.add('X');
		tst.add('B');
		tst.add('a');
		tst.add('b');
		tst.add('x');
		tst.add('P');
		tst.add('Q');
		tst.add('S');
		tst.add('A');
		System.out.println(tst);


		
		lhst.addAll(tst);
		System.out.println(lhst);

		LinkedHashSet copyOflhst = (LinkedHashSet) lhst.clone();
		System.out.println(copyOflhst);
		
		for(Object o : copyOflhst) {     // for each object o in linkedhashset copyoflhst
			System.out.println(o);
		}
		
		System.out.println(copyOflhst.getClass());
		System.out.println(copyOflhst.hashCode());
		

		copyOflhst.equals(copyOflhst);
		

	
	
		
	
		
	}

}
