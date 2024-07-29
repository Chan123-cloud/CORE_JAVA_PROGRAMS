package Collection_Queue;

import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.PriorityQueue;

import java.util.Vector;

public class Priority_Queue_Generic {
	
	// Only generic is possible , non- generic is not possible.
	
	public static void main(String[] args) {   // FIFO or the LIFO Concept
		
	
	PriorityQueue<Integer> C = new PriorityQueue<>();
	
	C.add(10);
	
	
	C.add(20);
	
	
	C.add(30);
	
	
	C.add(34);
	
	
	
	C.add(49);
	
	
	C.add(21);
	
	
	System.out.println(C);	
	
	
	
 PriorityQueue <Integer> D = new PriorityQueue<> (); // Only we can pass the Character.
	
	
	
	
	
	D.add(10);
	
	
	D.add(30);
	
	
	D.add(69);
	
	
	D.add(20);
	
	
	D.add(49);
	
	
	D.add(21);
	
	
	System.out.println(C);	
	
	
	
  	 

	// size
	
	System.out.println(C.size());
	
	
	// isEmpty
	
		System.out.println(D.isEmpty());
		

		
	

	
	
	  // for each loop
    
    for(Object  Q : C) {  // Here We can give the character Q : C...
   	 
   	 System.out.println(Q);
   	 
    }
    
    System.out.println();
    
    
    // Iterator Interface and iterator  methods used to  traverse the ele in uni directional
    
    Iterator I = C.iterator();
    
    while(I.hasNext()) {   // check wheather the next value is having or not
   	 
   	 
   	 System.out.println(I.next());  // print the next next elements 
   	 
    }
    
    System.out.println();
    
    
      // If we want to use the Listiterator in the Queue we have to convert it into one of the List and then proceed.
    
    Vector<Integer> J = new Vector<>(D);
    
    ListIterator K= J.listIterator();
   	 
   	 while(K.hasNext()) {
   		 
   		 System.out.println(K.next());
   	 
    }
   	 
   	 System.out.println();

   	 
   	 
   	 
  // Backward
   	 

   	 
   	 while(K.hasPrevious()) {
   		 
   		 System.out.println(K.previous());
   	 
    }
   	 
   	 
   	 // If we want to use Collections in the Queue we have to convert it into one of the List and then proceed.
   	 
     Vector<Integer> Y = new Vector<>(C);
     
     
   	
   	 
   	 Collections.sort(Y);
   	 
   	 System.out.println(Y);
   	                                                               
   	 
   	 // Printing the Elements in  Descending  order Using Collections Class   Works only in the Similar data type
   	 
   	 Collections.sort(Y,Collections.reverseOrder());
   	 
   	 System.out.println(Y);
   	 
   	 System.out.println();
   	 
   	 
   	 // retainAll --- It will retain the matched values IN C AND D that is displayed in C
   	 
   	 
    C.retainAll(D);
  	 
  	 System.out.println(C);
  	 
   	 
   	  
   	 //addAll   // Along with the C values D values are also get stored in the C
   	 
   	 C.addAll(D);
   	 
   	 System.out.println(C);
   	 
   	 
   	 // containsAll  // check wheather all the values in D is present in C or not.
   	 
   	 System.out.println(C.containsAll(D));
   	 
   	 
   	 
   	
  // retainAll - Values in D compred with C if both are matches then all D values and matched C values will print.
  	 
  	 C.retainAll(D);
  	 
  	 System.out.println(C);
  	 
  	 
  	 
  	 // remove	All   -- It will remove all the values in the C and D
  	 
  	 	C.removeAll(D);
  	 	
  	 	System.out.println(C);
  	 
  	 
   	 
  	 
  	 
  // Clear  -- To delete all the values
  	 
  	 
  	 C.clear();
  	 
  	 System.out.println(C);
  	 
  	 D.clear();
  	 
  	 System.out.println(D);
  	 
  	 
  	
	


}
}
