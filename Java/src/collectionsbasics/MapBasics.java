package collectionsbasics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Map =>Key Value Pair => Separate interface not part of Collection interface => implementing classes HashMap , LinkedHashMap 
		// Keys can't be duplicate  but values can be duplicate => single null as key allowed, multiple null as key not allowed but value allowed 
	
		Map m = new HashMap();
		Map m1 = new HashMap<Integer, String>();
		
		
		HashMap<Integer, String> m2 = new HashMap<Integer, String>();
		
		m2.put(101, "Lalit Patil");
		m2.put(102, "Shiv");
		m2.put(103, "Akshay");
		m2.put(101, "Lalit");
		m2.put(104, "Lalit Patil");
		m2.put(105, "Lalit Patil");
		

		System.out.println(m2);
		
		
		HashMap<String,Integer> m3 = new HashMap<String,Integer>();
		
		m3.put("Lalit Patil",101);
		m3.put("Shiv",102);
		m3.put("Akshay",103);
		m3.put("Lalit",101);
		m3.put("Lalit Patil",104);
		m3.put("Lalit Patil",105);
		

		System.out.println(m3);
		
		System.out.println(m3.get("Lalit"));
		System.out.println(m3.get("Patil"));
		
		m3.clear();
		System.out.println(m3);
		
		System.out.println(m3.containsKey("Lalit"));
		System.out.println(m2.containsKey(101));
		
		System.out.println(m3.containsValue("Lalit"));
		System.out.println(m2.containsValue("Lalit"));
		
		System.out.println(m2.getOrDefault(106, "Default"));
		System.out.println(m2.get(106));
		
		System.out.println(m3.isEmpty());
		
		Set<Integer> keySet = m2.keySet();
		
		System.out.println(keySet);
		
		
		
		HashMap<Integer, String> m4 = new HashMap<Integer, String>();
		
		m4.put(107, "Lalit Patil");
		m4.put(108, "Shiv");
		m4.put(109, "Akshay");
		m4.put(110, "Lalit");
		m4.put(111, "Lalit Patil");
		m4.put(1021, "Lalit Patil");

		m2.putAll(m4);
		System.out.println(m2);
		
		m2.putIfAbsent(10111, "He Hello");
		System.out.println(m2);
		
		m2.putIfAbsent(111, "Shiv vyavhare");
		System.out.println(m2);
		m2.put(111, "Shiv vyavhare");
		System.out.println(m2);
		
		m2.remove(111);
		System.out.println(m2);
		
		m2.remove(107, "Lalit Patil");
		System.out.println(m2);
		
		m2.replace(109, "Manisha");
		System.out.println(m2);


		m2.replace(100, "Pranjal");
		System.out.println(m2);
		
		m2.replace(108, "Akshay", "Demo");
		System.out.println(m2);
		
		HashMap<Integer, String> m5 = new HashMap<Integer, String>();
		
		m5.put(101, "Lalit");
		m5.put(102, "Shiv");
		m5.put(103, "Akshay");
		
		System.out.println(m5);

HashMap<Integer, String> m6 = new HashMap<Integer, String>();
		
		m6.put(101, "Pune");
		m6.put(102, "Nashik");
		m6.put(103, "Mumbai");
		
		Collection c = m2.values();
		System.out.println(c);
		
		
		Set<Integer> keySet1 = m2.keySet();

		Iterator it = keySet1.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		System.out.println("#################################################################");
		
		
		HashMap<Integer, String> m7 = new HashMap<Integer, String>();
		
		m7.put(1234, "ABC");
		m7.put(2345, "PQR");
		m7.put(3456, "XYZ");
		m7.put(4567, "OPQ");
		m7.put(5678, "ABC");
		m7.put(6789, "PQR");
	
		
		System.out.println(m7);
		
		m7.keySet().removeAll(List.of(1234,2345,3456));
		m7.values().removeAll(List.of("ABC","PQR"));
		System.out.println(m7);
		
		m7.forEach((key,value)->System.out.println(key + " "+ value));
		
		System.out.println("#################################################################");

		HashMap<Integer, String> m8 = new HashMap<Integer, String>();
		
		m8.put(1234, "ABC");
		m8.put(2345, "PQR");
		m8.put(3456, "XYZ");
		m8.put(4567, "OPQ");
		m8.put(5678, "ABC");
		m8.put(6789, "PQR");
		
		

		for(HashMap.Entry<Integer, String>  entry : m8.entrySet() ) {
			Integer key = entry.getKey();
			System.out.println(key+ " -> "+m8.get(key));
		}
	}

}
