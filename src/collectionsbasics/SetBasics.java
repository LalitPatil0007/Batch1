package collectionsbasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Set (I) => HashSet(C) , LinkedHashSet(C)
		
		Set st = new HashSet();
		st.add("ABC");
		st.add("ABC");
		st.add("ABC");
		st.add("XYZ");
		st.add(1234);
		st.add(12.34);
		st.add(12.34);
		st.add(null);
		st.add(null);

		
		System.out.println("st : "+st);
		
		HashSet<Character> charSet1 = new HashSet<Character>(Arrays.asList('C','D','E','F','G','C','G','E'));
		System.out.println("charSet1 "+charSet1);
	
		st.addAll(charSet1);
		
		System.out.println("st after adding charSet1 : "+st);
		
		st.clear();
		
		System.out.println("st after clear : "+st);
		
		System.out.println(" is st empty :"+st.isEmpty());
		
		System.out.println(" is charSet1 contains G : "+charSet1.contains('G'));
		System.out.println(" is charSet1 contains X : "+charSet1.contains('X'));
		System.out.println(" is charSet1 contains g : "+charSet1.contains('g'));
		
	System.out.println("check charSet1 has ('G','C','D') :"+charSet1.containsAll(Arrays.asList('G','C','D')));
	
	charSet1.remove('G');
	System.out.println("charSet1 after removing G :"+charSet1);
	
	charSet1.remove('H');
	System.out.println("charSet1 after removing H :"+charSet1);
	
	charSet1.removeAll(Arrays.asList('C','E'));
	System.out.println("charSet1 after removing C,A :"+charSet1);
	
	charSet1.addAll(Arrays.asList('P','Q','R'));
	System.out.println("charSet1 after adding P,Q,R :"+charSet1);
	
	charSet1.retainAll(Arrays.asList('P','Q','R'));
	System.out.println("charSet1 after retaining P,Q,R :"+charSet1);
	
	HashSet clonedHashSet = (HashSet) charSet1.clone();
	System.out.println("clonedHashSet : "+clonedHashSet);
	

	
	
	
	
	HashSet<String> strHst = new HashSet<String>(Arrays.asList("ABC","XYZ","PQR","STU"));
	
	
	HashSet<String> strHstCopy = (HashSet<String>) strHst.clone();
	
	System.out.println(strHst.equals(strHstCopy));

	
	System.out.println(strHstCopy);
	strHstCopy.clear();
	System.out.println(strHstCopy);
	System.out.println(strHst);
	
	
	System.out.println(strHst.equals(strHstCopy));
	
	System.out.println(strHst.size());
	
	
	
	ArrayList<String> strListOfSet =  new ArrayList<String>(strHst);
	
	System.out.println(strListOfSet.get(0));
	
	
	Object[] arr = strHst.toArray();
	System.out.println(arr[0].toString().toLowerCase());
	
	
	
	Iterator it = strHst.iterator();
	
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	

	}

}



