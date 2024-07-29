package Proper_Exception_Handling;

public class Negative_Array_Size_Exception {
	
  public static void main(String[] args) throws NegativeArraySizeException {
		                                      
                                       // Here Jvm Will Automaticaaly get the Exception thrown by the main method
	  
	                                      // And handled by the Default Exception Handler
                                        
  
		System.out.println("Going to pass the Exception to the Catch");
	  
		int a[] = new int [-3];
		
		a[0] =10;
		
		System.out.println(a[0]);
	 
	  
	  

}
  
}
