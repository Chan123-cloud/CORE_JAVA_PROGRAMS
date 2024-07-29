package Collection_Set;

import java.util.ArrayList;

import java.util.Collections;

import java.util.Iterator;

import java.util.LinkedHashMap;

import java.util.LinkedHashSet;

import java.util.LinkedList;

import java.util.ListIterator;

public class Linked_hashSet_Generic {

	
	
	public static void main(String[] args) {
		
		
		
		
		  LinkedHashSet<String> A = new LinkedHashSet<>();
			
			A.add("Chandru");
			
			A.add("Ramu");
			
			A.add("damu");
			
			A.add("Ramu");
			
			A.add("moha");
			
			
			
		   LinkedHashSet <String> B = new LinkedHashSet<>();
			
			B.add("hari");
			
			B.add("dharani");
			
			B.add("damu");
			
			B.add("babu");
			
			B.add("moha");
			
			
			
			System.out.println(A);
			
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
			
			for(String Q:B) {
				
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
			
			
			ArrayList <String>  E = new ArrayList<>(B);
			
			
			
			ListIterator S = E.listIterator();
			
			
			while (S.hasNext()) {     //  --- This is for traversing in the forwrd.
				
				System.out.println(S.next());
			}
			
			System.out.println();
			
			
			
			while (S.hasPrevious()) {     //  --- This is for traversing in the Backward
				
				System.out.println(S.previous());
			}
			
			
			System.out.println();
			
			
			// For using the Collections class in the hashset 
			
			// we have to convert them into an one of the list and then we have to perform the operation 
			
			
			LinkedList<String> R = new LinkedList<>(A);
			
			
			
			
			// Acsending Order
			
			Collections.sort(R);
			
			System.out.println(R);
			
			
			// Descending order
			
			Collections.sort(R, Collections.reverseOrder());
			
			System.out.println(R);
			
			System.out.println( );
			

			//	convert it into an Araay
			
			
			Object[] T = new String[A.size()];
			
			T =  A.toArray(T);
			
			for(Object W : T) {
				
				System.out.println(W);
			}


			
			
			
			// clear
			
			A.clear();
			
			System.out.println(A);
			
			B.clear();
			
			System.out.println(B);
			
			
			
			
}
}
