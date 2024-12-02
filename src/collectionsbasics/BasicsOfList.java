package collectionsbasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class BasicsOfList {
	
	/*
	 * collection => group of entities or  objects as a single entity
	 * collection framework => group of classes and interfaces used to represent group of objects as a single entity
	 * Arrays => size is fixed , no predefined methods to remove add need logic , homogeneous data 
	 * collections framework=> size can be increased at runtime , have predefined methods , homogeneous plus heterogeneous data
	 *collection => interface common method across the collection framework
	 *collections => class from java.utils => have predefined method we can use perform action on collection objects  Ex => Collections.sort(ArrayList) ,Collections.suffle(Collection C)
	 *
	 *Collection parent interface => List , Set , Queue   child interfaces => implemented by there respective classes
	 *
	 *List => child interface of interface => insertion order preserved => duplicates are allowed 
	 *List Interface implemented by => ArrayList   , LinkedList
	 *
	 *Set Interface => child interface of Collection => insertion order not preserved => duplicates not allowed 
	 *Set Interface implemented by => HashSet , LinkedHashSet
	 *
	 *Map is Interface => group of object but they will be in form of keys and value pairs   => keys can't be duplicated , values can be duplicated
	 *Map implemented by classes => HashMap ,  LinkedHashMap
	 *
	 *
	 *Collection Interface methods => add(Object o), addAll(Collection c), remove(Object o),removeAll(Collection c),retainAll(Collection c) -> retain what provided remove remaining,size(),clear(),isEmpty(),contains(Object o),containsAll(Collection c),toArray(Collection C)
	 *
	 *List Interface methods => add(index,object),addAll(index,Collection c), remove(index) , get(index) , set(index,object) replace existing with new object 
	 *ArrayList => retrieval operations are faster  => as directly go to that index position => consecutively placed 
	 *All methods from List interface available
	 *LinkedList => links with node => while insertion , deletion no shifting takes place only nodes will be removed or added  => cannot use this for retrieve as it will start to search from 1st node => not placed consecutively nodes will be used to link them in order
	 *additional methods => addFirst() addLast() ,removeFirst(),removeLast() ,getFirst() , getLast()
	 *
	 *Set => implemented by HashSet and LinkedHashSet
	 *HashSet => duplicates not allowed , order not preserved => searching operations are faster(use hash code concept), no index concept , null also allowed but one only
	 *LinkedHashSet =>duplicates not allowed , order not preserved 
	 **/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		String str[] = {"sah","dhjdb","dbd"};
		ArrayList al = new ArrayList( Arrays.asList(str));
		System.out.println(al);
		
		Iterator it = al.iterator();
		
		Object[] str1 = al.toArray();
		
		
		HashSet hs = new HashSet();
		
		HashMap<Integer,String> m = new HashMap<Integer,String>();
		
		m.put(1,"one");
		m.put(1,"one");
		m.put(2,"two");
		m.put(3,"three");
		m.put(4,"four");
	
		for(Map.Entry<Integer, String > e : m.entrySet()) {
			System.out.println(e.getKey() + " "+ e.getValue());
		}
		

		
		
	}

}
