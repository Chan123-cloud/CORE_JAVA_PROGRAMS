package objectClassMethods;

import java.util.Objects;

public class Driver_Equals_obj_method1 {
	
	public static void main(String[] args) {
		
		Equals_obj_Method C = new Equals_obj_Method("CHANDRA KUMAR M",35000.000);
		
		Equals_obj_Method  D = new Equals_obj_Method("CHANDRA KUMAR M",35000.000);
		
		System.out.println(C==D); // It will give the Answer as false because the two objects are Created here.
		
		
		System.out.println(C.equals(D));  // because the both obj has the same values.
		
		
		// So here in this program C is current obj ( we can use the this key to access C )
		
		// D is the passing obj
		
		
	    System.out.println(C.hashCode());
		
		System.out.println(D.hashCode());
		
		System.out.println(C.hashCode() == D.hashCode());  // Without Overriding
	  
		
	}
	
	
	}


