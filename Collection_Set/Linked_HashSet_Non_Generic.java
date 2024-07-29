package Collection_Set;

import java.util.ArrayList;

import java.util.Iterator;

import java.util.LinkedHashSet;

import java.util.ListIterator;

public class Linked_HashSet_Non_Generic {
	
	
	public static void main(String[] args) {
		
		
		
		
		LinkedHashSet A= new LinkedHashSet();
		
		A.add("gopi");
		
		A.add(false);
		
		A.add("gopi");
		
		A.add ('A');
		
		A.add(23);
		
		A.add(34324.4234);
		
		
		System.out.println(A);
		
		
	LinkedHashSet B= new LinkedHashSet();
		
		
	    B.add("gopi");
		
		B.add(true);
		
		B.add("gopi");
		
		B.add ('B');
		
		B.add(21);
		
		B.add(34324.4234);
		
		
		System.out.println(B);
		
		
		// size
		
			System.out.println(A.size());
			
			
			// isEmpty
			
				System.out.println(A.isEmpty());
				
				
			// remove
				
			A.remove(0);
			
			System.out.println(A);
			
			A.remove("damu");
			
			System.out.println(A);
			


			// add all
			
			A.addAll(B);
			
			System.out.println(A);
			
			
			
			// contains
			
			System.out.println((B.contains("ramu")));
			
			
			
			// contains All
			
			System.out.println(A.containsAll(B));
			
			
			// retainAll -- this will also work.
			
			
			// removeAll
			
			A.removeAll(B);
			
			System.out.println(A);
			
			System.out.println();
			
			
			// for each loop
			
			for(Object Q:B) {
				
				System.out.println(Q);
			}
			
			System.out.println();
			
			
			// Iterator
			
			Iterator Z = B.iterator();
			
			while(Z.hasNext()) {
				
				System.out.println(Z.next());
			}
			
			System.out.println();
			
			
			//List Iterator  --  If we want to use it in Linkedhasset have to convert it into an array list or one of the list.
			
			
			ArrayList  E = new ArrayList (B);
			
			ListIterator S = E.listIterator();
			
			
			while (S.hasNext()) {     //  --- This is for traversing in the forwrd.
				
				System.out.println(S.next());
			}
			
			System.out.println();
			
			
			
			while (S.hasPrevious()) {     //  --- This is for traversing in the Backward
				
				System.out.println(S.previous());
			}
			
			
		
			// clear
			
			A.clear();
			
			System.out.println(A);
			
			B.clear();
			
			System.out.println(B);
			
			   //  Collections class Ascending and the Descending order  Inbuilt functions will not work in non generic
		    

	
			
			
			
			
			
}
}
