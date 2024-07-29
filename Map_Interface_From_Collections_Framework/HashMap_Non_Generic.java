package Map_Interface_From_Collections_Framework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap_Non_Generic {
	
	public static void main(String[] args) {
		
		HashMap  A = new HashMap();
		
		A.put("CHANDRU", true);
		
		A.put(10, null);
		
		A.put(null, 265.34f);  // Accepts only one null key
		
		A.put(null, null);
		
		A.put("Ram", '@');    // Accepts Multiple null Valuees		
		
		System.out.println(A);
		
		
		
      HashMap  B = new HashMap();
		
		B.put("EDVIN", null);
		
		B.put(10, 'U');
		
		B.put(null, 265.34f);  // Accepts only one null key
		
		B.put(null, null);
		
		B.put("Damu", '@');    // Accepts Multiple null Values		
		
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
		
		
		// clear -- Used to remove all the keys and the values from the Map.
		
		
					A.clear();
					
					System.out.println(A);
					
					
					B.clear();
					
					System.out.println(B);
					
					
			// Map.Entry is not possible here,  because in the <> We have to give the key,value Pair.
					
					
		 // Collections of sorting is also not posiible here.
					
					
				
		
			
		}
			
			
			
		
	}


