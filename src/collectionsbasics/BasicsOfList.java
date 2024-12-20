package collectionsbasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
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
		

      // List => Interface => growable size , predefined methods to add,delete or retrive elements, duplicate , null ? , Single dimension, ordered placement 
		 // Classes which implements List Interface => ArrayList , LinkedList
		
		List lt =  new ArrayList();
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		ArrayList<Character> al2 = new ArrayList<Character>();   // Homogeneous type list
		ArrayList<String> al3 = new ArrayList<String>();

		
		ArrayList al = new ArrayList();   // Heterogeneous type list

		al.add("Hello");
		al.add(10);
		al.add('C');
		al.add(10.111);
		
		System.out.println(al);
		
		al.add(1, "HI");
		
		System.out.println(al);     // [Hello, HI, 10, C, 10.111]
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(12);
		intList.add(13);
		intList.add(14);
		
		System.out.println(intList);
		
		al.addAll(intList);
		
		System.out.println(al);
		
		al.addAll(2, intList);
		
		System.out.println(al);
		
		
		System.out.println(al.add(2000));
		
		
		System.out.println(al);  // [Hello, HI, 12, 13, 14, 10, C, 10.111, 12, 13, 14, 2000]
		
		boolean isPresent = al.contains(30000);
		System.out.println(isPresent);
		
		intList.clear();
		
		System.out.println("int list is "+intList);  // intList = []
		
		
		ArrayList newArrList =  (ArrayList) al.clone();
		
		System.out.println("newArrList is "+newArrList);
	
		System.out.println("newArrList Contains al "+newArrList.containsAll(al));
		
		System.out.println(al.get(5));
		
		System.out.println("index position of 2000 : "+al.indexOf(2000));
		
		System.out.println("index position of 2000 : "+al.indexOf("Hey"));
		
		
		//###################################################################################################################
		System.out.println("#############################################################################################");
		
		ArrayList<Integer> intList1 = new ArrayList<Integer>();  // [12,13,14,15,15,15]
		intList1.add(12);
		intList1.add(13);
		intList1.add(14);
		intList1.add(15);
		intList1.add(15);
		intList1.add(15);
		System.out.println(intList1);
		
		System.out.println(intList1.isEmpty());
		System.out.println(intList1.indexOf(15));
		System.out.println(intList1.lastIndexOf(15));
		intList1.remove(2);
		System.out.println(intList1);
		Integer i = 15;
		intList1.remove(i);
		System.out.println(intList1);  // intList1 = [12, 13, 15, 15]
		
		ArrayList<Integer> intList2 = new ArrayList<Integer>();   // [12,13]
		intList2.add(120);
		intList2.add(130);
		
		intList1.removeAll(intList2);
		
		System.out.println(intList1);
		
		
		
		ArrayList<Integer> intList3 = new ArrayList<Integer>();  
		intList3.add(120);
		intList3.add(130);
		intList3.add(140);
		intList3.add(150);
		intList3.add(155);
		intList3.add(1565);
		
		
		ArrayList<Integer> intList4 = new ArrayList<Integer>(); 
		intList4.add(120);
		intList4.add(130);
		intList4.add(140);
		
		intList3.retainAll(intList4);
		
		System.out.println(intList3);
		
		
		ArrayList<Integer> intList5 = new ArrayList<Integer>();  // a = [12,13,14,15,15]   a.add(2,100); => [12,13,100,14,15,15]        
		intList5.add(12000);                                    // b = [13,14,15,16,17]   b.set(3,116)   => [13,14,15,116,17]
		intList5.add(130000);
		intList5.add(14000);
		intList5.add(150000);
		intList5.add(150005);
		intList5.add(150065);
		
		intList5.set(1, 100);
		
		System.out.println(intList5);
		
		intList5.sort(null);
		
		System.out.println(intList5);
		
		intList5.sort(Collections.reverseOrder());
		
		System.out.println(intList5);
		
//		Collections.sort(intList5);
//		
//		System.out.println(intList5);
//		
//		Collections.shuffle(intList5);
//
//		System.out.println(intList5);
//
//		Collections.sort(intList5,Collections.reverseOrder());
//
//		System.out.println(intList5);
		
		
		
		ArrayList<Integer> intList6 = new ArrayList<Integer>();         
		intList6.add(11111);                                    
		intList6.add(33333);
		intList6.add(555555);
		intList6.add(666666);
		intList6.add(77777);
		intList6.add(999999);
		
		
		System.out.println("to String operation : "+intList6.get(0).toString().substring(0,4));
		
		List<Integer> intList7 =  intList6.subList(3, 5); 
		
		System.out.println(intList7);
		
		Object[] a = intList7.toArray();
		
		for(int j =0 ;j<a.length;j++) {
			System.out.println(a[j]);
			int x = (int) a[j];
			System.out.println(x);
		}
	    
		

	
		
	}

}
