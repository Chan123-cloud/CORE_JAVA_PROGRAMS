package Collection_Set;

import java.util.ArrayList;

import java.util.Collections;

import java.util.Iterator;

import java.util.LinkedList;

import java.util.ListIterator;

import java.util.TreeSet;

public class TreeSet_Generic {
	
	public static void main(String[] args) {
		

	
	// Only generic is possible non_ generic is not possible
		
		
		// Ascending Order
	
		 TreeSet<Integer> A = new TreeSet<>();
			
			A.add(54345);
			
			A.add(343);
			
			A.add(43);
			
			A.add(21);
			
			A.add(675);
			
			
			
			// Ascending Order
			
		   TreeSet <Integer> B = new TreeSet<>();
			
			B.add(343);
			
			B.add(34);
			
			B.add(43);
			
			B.add(45);
			
			B.add(565);
			
			
			
			System.out.println(A);
			
			System.out.println(B);
			
			
			// descending Order
			
			 TreeSet <Integer> C = new TreeSet<>(Collections.reverseOrder());
			 
			 C.add(2343);
			 
			 C.add(232);
			 
			 C.add(43235);
			 
			 C.add(4);
			 
			 
			 System.out.println(C);
				
			
			
			
			
			// size
			
			System.out.println(A.size());
			
			
			// isEmpty
			
				System.out.println(A.isEmpty());
				
				
			// remove
				
			A.remove(0);
			
			System.out.println(A);
			
			A.remove(343);
			
			
			System.out.println(A);
			


			// add all
			
			A.addAll(B);
			
			System.out.println(A);
			
			
			
			// contains
			
			System.out.println((B.contains(1)));
			
			
			
			// contains All
			
			System.out.println(A.containsAll(B));
			
			
			// retainAll -- this will also work.
			
			
			// removeAll
			
			A.removeAll(B);
			
			System.out.println(A);
			
			System.out.println();
			
			
			// for each loop
			
			for(Integer Q:B) {
				
				System.out.println(Q);
			}
			
			System.out.println();
			
			
			// Iterator
			
			Iterator Z = B.iterator();
			
			while(Z.hasNext()) {
				
				System.out.println(Z.next());
			}
			
			System.out.println();
			
			
			//List Iterator  --  If we want to use it in hasset have to convert it into an array list or one of the list.
			
			
			ArrayList <Integer>  E = new ArrayList<>(B);
			
			
			
			ListIterator S = E.listIterator();
			
			
			while (S.hasNext()) {     //  --- This is for traversing in the forwrd.
				
				System.out.println(S.next());
			}
			
			System.out.println();
			
			
			
			while (S.hasPrevious()) {     //  --- This is for traversing in the Backward
				
				System.out.println(S.previous());
			}
			
			
			System.out.println();
			

			// This is second format for the Ascending and the Descending Order.
			
			
			
	// For using the Collections class in the hashset.
			
			
			
			// we have to convert them into an one of the list and then we have to perform the operation 
			
			
			LinkedList<Integer> R = new LinkedList<>(A);
			
			
			
			
			// Acsending Order
			
			Collections.sort(R);
			
			System.out.println(R);
			
			
			// Descending order
			
			Collections.sort(R, Collections.reverseOrder());
			
			System.out.println(R);
			
			System.out.println();
			
			
			
			
			
			// clear
			
			A.clear();
			
			System.out.println(A);
			
			B.clear();
			
			System.out.println(B);
			
			
	


}
}
