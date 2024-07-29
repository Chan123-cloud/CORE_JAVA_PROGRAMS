package Map_Interface_From_Collections_Framework;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap_With_Generic {
	
	public static void main(String[] args) {
		
	
	
	
	TreeMap<Integer,Integer> A = new TreeMap<>();
	
	A.put(10, null);  // TreeMap doesnot allow any null keys ,but allow mul null values. 
	
	A.put(23, 23);
	
	A.put(456, 21000);
	
	A.put(21, 67);
	
	A.put(23, 1);
	
	System.out.println(A);
	
	
	

	TreeMap<Integer,Integer> B = new TreeMap<>(Collections.reverseOrder());
	
	B.put(1000, null);  // TreeMap doesnot allow any null keys ,but allow mul null values. 
	
	B.put(213, 23);
	
	B.put(456, null);
	
	B.put(21, 67);
	
	B .put(8, 11);
	
	System.out.println(B);
	
	

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
	
	
	
	for(Map.Entry<Integer,Integer> E : A.entrySet()) {
		
		
		
		System.out.println(E);  // Used to get the each key value pair individualy without () and [].
		
		
		System.out.println(E.getValue());  // Used to get the value alone.
		
		
		System.out.println(E.getKey());   // Used  to get the key alone.
		
		
	}
	
	
	// clear -- Used to remove all the keys and the values from the Map.
	
	
	A.clear();
	
	System.out.println(A);
	
	
	B.clear();
	
	System.out.println(B);
	
		
	
	
	

}
	
}
