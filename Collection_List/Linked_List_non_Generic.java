package Collection_List;


import java.util.Collections;

import java.util.Iterator;

import java.util.LinkedList;

import java.util.ListIterator;

public class Linked_List_non_Generic {
	
	public static void main(String[] args) {
		
	     LinkedList A = new LinkedList();
	     
	     A.add(100);
	     
	     A.add("ramu");
	     
	     A.add(false);
	     
	     A.add(1421.323f);
	     
	     A.add(5654312.3432343454544);
	     
	     A.add('d');
	     
	     System.out.println(A);  // Automatically the to string method will override.
	     
	    LinkedList B = new LinkedList();
	     
	     B.add(100);
	     
	     B.add(false);
	     
	     B.add(221.323f);
	     
	     B.add(423.3423432);
	     
	     B.add('f');
	     
	     System.out.println(B);
	     
	     
	     System.out.println();
		
		// In Built Methods
	    
	     
	     
	     // size
	     
	     System.out.println(A.size());
	     
	     // isempty
	     
	     System.out.println(A.isEmpty());      // These all methods are also applicable for the generic functions
	     
	     // indexOf
	     
	     System.out.println(A.indexOf(false));
	     
	     
	     // lastIndexOf
	     
	     System.out.println(A.lastIndexOf(1));
	     
	     // contains
	     
	     System.out.println(A.contains(false));
	     
	     // remove
	     
	     System.out.println(A.remove(3));
	     
	     System.out.println(A);
	     
	      //set
	     
	     System.out.println(A.set(3  ,"Mohan"));
	     
	     System.out.println(A);
	     
	     
	     //get 
	     
	     System.out.println(A.get(3));
	     
	     System.out.println();
	     
	     
	     
	     

	     	  
	     
	   // for each loop
	     
	     for(Object o : A) {
	    	 
	    	 System.out.println(o);
	     }
	     
	     
	     System.out.println();
	     
	   // Iterator Interface and iterator  methods used to  traverse the ele in uni directional
	     
	     Iterator I = A.iterator();
	     
	     while(I.hasNext()) {   // check wheather the next value is having or not
	    	 
	    	 
	    	 System.out.println(I.next());  // print the next next elements 
	    	 
	     }
	     
	     System.out.println();
	     
	   // ListIterator Interface and listIterator methods which are used to traverse the ele in the Bi directional.
	       
	     // Forward
	     
	     ListIterator J = A.listIterator();
	    	 
	    	 while(J.hasNext()) {
	    		 
	    		 System.out.println(J.next());
	    	 
	     }
	    	 
	    	 System.out.println();
	 
	    	 
	    	 
	    	 
	   // Backward
	    	 
	 
	    	 
	    	 while(J.hasPrevious()) {
	    		 
	    		 System.out.println(J.previous());
	    	 
	     }
	    	 
	    	
	    	
	    	 
	     // clear ---  To delete the values
	    	 
	    	 A.clear();
	    	 
	    	 System.out.println(A);
	    	 
	    	 System.out.println(A.size());
	    	 
	    	 
	    //  add all  --- All ele in the B will be added to the A
	    	 
	    	 A.addAll(B); 
	    	 
	    	 System.out.println(A);   // In non generic without A values only B values get stored in the A
	    	 
	    	 System.out.println(B);
	    	 
	    	 
	    // Contains all -- It will check all the ele in the B is present in A
	    	 
	    	System.out.println(A.containsAll(B));
	    	
	    	
	    	 
	    	   //  Collections class Ascending and the Descending order  Inbuilt functions will not work in non generic
		    

	}
	}
