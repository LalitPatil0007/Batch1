package collectionsbasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList();
		list.add("1234");
		list.add("pune");
		list.add("mumbai");
		
		System.out.println(list);
		
		list.addFirst("Nashik");
		System.out.println(list);
		list.addLast("poppoodbwj");
		System.out.println(list);
		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());

		list.removeFirst();
		System.out.println(list);
		
		list.removeLast();

		System.out.println(list);
		
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {    
			System.out.print(it.next());
		}
		
		
		
		List<String> strList = List.of("ABC","EFG","HIJ");
		LinkedList<String> linkList1 = (LinkedList<String>) List.of("ABC","EFG","HIJ");
		ArrayList<String> linkList2 = (ArrayList<String>) List.of("ABC","EFG","HIJ");
		
		ArrayList<Integer> intArrList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		

	}

}
