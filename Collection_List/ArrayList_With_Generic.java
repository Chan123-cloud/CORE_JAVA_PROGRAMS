package Collection_List;

import java.util.ArrayList;

import java.util.Collections;

import java.util.Iterator;

import java.util.ListIterator;

public class ArrayList_With_Generic {
	
	public static void main(String[] args) {
	
	
	ArrayList <Integer> C = new ArrayList<>();  // Only we can pass the Character.
	
	
	C.add(10);
	
	
	C.add(20);
	
	
	C.add(30);
	
	
	C.add(34);
	
	
	
	C.add(49);
	
	
	C.add(21);
	
	
	System.out.println(C);	
	
	
	
 ArrayList <Integer> D= new ArrayList<>();  // Only we can pass the Character.
	
	
	
	
	
	D.add(10);
	
	
	D.add(30);
	
	
	D.add(69);
	
	
	D.add(20);
	
	
	D.add(49);
	
	
	D.add(21);
	
	
	System.out.println(C);	
	
	
	
  	 
  	 
	

	
	
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
    
    
      
    
  // ListIterator Interface and listIterator methods which are used to traverse the ele in the Bi directional.
      
    // Forward
    
    ListIterator J = C.listIterator();
   	 
   	 while(J.hasNext()) {
   		 
   		 System.out.println(J.next());
   	 
    }
   	 
   	 System.out.println();

   	 
   	 
   	 
  // Backward
   	 

   	 
   	 while(J.hasPrevious()) {
   		 
   		 System.out.println(J.previous());
   	 
    }
   	 
   	 
   	 // Printing the Elements in Ascending order Using Collections Class     Works only in the Similar data type
   	 
   	 
   	 Collections.sort(C);
   	 
   	 System.out.println(C);
   	                                                               
   	 
   	 // Printing the Elements in  Descending  order Using Collections Class   Works only in the Similar data type
   	 
   	 Collections.sort(C,Collections.reverseOrder());
   	 
   	 System.out.println(C);
   	 
   	 
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
