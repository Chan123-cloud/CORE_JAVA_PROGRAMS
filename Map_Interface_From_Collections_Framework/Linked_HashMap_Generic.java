package Map_Interface_From_Collections_Framework;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Linked_HashMap_Generic {
	
	public static void main(String[] args) {
		
	
	
	LinkedHashMap<Integer,String> A = new LinkedHashMap<>();
	
	A.put(10, "Chandru");        // Hash Map does not maintains the Insertion Order.
	
	A.put(20, "Ram");
	
	A.put(30, "Santhosh");
	
	System.out.println(A);   // Used to print tha All keys and Values in curly brahses.
	

	
	
	
	LinkedHashMap<Integer,String> B = new LinkedHashMap<>();
	
	B.put(1, "Siva");        // Hash Map does not maintains the Insertion Order.
	
	B.put(2, "ram");
	
	B.put(3 , "Sandy");
	
	System.out.println(B);   // Used to print tha All keys and Values in curly brahses.
	
	
	
	// IsEmpty
	
	System.out.println(A.isEmpty());
	
	
	// Size
	
	
	System.out.println(A.size());
	
	
	
	// keySet  ---  Return Type Set----	Used to reterive all the Keys in ths square brackect.
	
	System.out.println(A.keySet());
	
	
	System.out.println();
	
	// Alternative
	
	Set W = A.keySet();
	
	for(Object  S : W) {
		
		System.out.println(S);
	}
	
	
	
	//values  --- Return Type Collection ---- Used to reterive all the values in the square brackect.
	
	System.out.println(A.values());
	
	
	System.out.println();
	
	
	// Alternative
	
  Collection Q = A.values();

for(Object R : Q) {
	
	System.out.println(R);
		
	}


System.out.println();
	
	
	// containsKey
	
	System.out.println(A.containsKey(1));
	
	
	
	// containsValues
	
	System.out.println(A.containsValue("Chandru"));
	
	
	
	// get -- By passing the Argument as a key in the get method we can reterive the Specific val of thet key.
	
	
	System.out.println(A.get(20));
	
	
	
	// Remove ---  By passing the Argument as a key in the get method we can delete the Specific key and val from the Map.
	
	System.out.println(A.remove(20));
	
	
	System.out.println(A);
	
	
	System.out.println();
	
	
	
	// Putall  -- Stroring tha all the B values in the A -- Then in A 
	
    A.putAll(B);

   System.out.println(A);
	
	
	
	
	System.out.println();
	
	
	
	System.out.println(A); // It will retrun the output in the Map
	
	
	System.out.println();
	
	
	System.out.println(A.entrySet());  // It will return the output in the set format.
	
	
	// Alternative
	
	
	// Map.Entry <key, value> ref : ref val .entry Set();--- Used to get the specific Entity from the set
	
	
	// getValue and the getKey is the inbuilt methods of the Map.Entity.
	
	
	
	for(Map.Entry<Integer,String> E : A.entrySet()) {
		
		
		
		System.out.println(E);  // Used to get the each key value pair individualy without () and [].
		
		
		System.out.println(E.getValue());  // Used to get the value alone.
		
		
		System.out.println(E.getKey());   // Used  to get the key alone.
		
		
	}
		
		
		
		// Sotring will happen when the hashmap converted into the tree Map
		
		
		
		
		TreeMap<Integer,String> X = new TreeMap<>(A);  // have to pass the ref of the HashMap
		
		
		
		System.out.println(X);  // Based on the key it will sort in the Ascending Order.
		
		
		
		TreeMap<Integer,String> X1 = new TreeMap<>(Collections.reverseOrder());  
		
		
		// At starting we will reverse the X1 and then we will store the value of the A
		
		
		
		X1.putAll(A);   // Adding tha A entity to X 
		
		System.out.println(X1);
		
		
		// clear -- Used to remove all the keys and the values from the Map.
		
		
		A.clear();
		
		System.out.println(A);
		
		
		B.clear();
		
		System.out.println(B);
		
		
		// One null key and Multiple null values are also work in Generic.
		
		


}
	
}
