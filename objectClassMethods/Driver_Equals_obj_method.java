package objectClassMethods;

public class Driver_Equals_obj_method {
	
	public static void main(String[] args) {
		
		Equals_obj_Method  A = new Equals_obj_Method ("Livin",35000.00000);
		
		Equals_obj_Method B = A;
		
		System.out.println(A==B);
		
		System.out.println(A.equals(B));  // Both will give the same Answer
		
		          
		// checks the objects ref addresses or mem addresses are same
		
		

		// Gives the unique Integer Number based on the memory address of the object reference.
		
		System.out.println(A.hashCode());
		
		System.out.println(B.hashCode());
		
		System.out.println(A.hashCode() == B.hashCode());  // Without Overriding
	  
	}

}
