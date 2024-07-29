package Proper_Exception_Handling;

public class Null_Pointer_Exception_Handling {
	
	
  public static void main(String[] args) {
	  
	  try {
			
			String s1 =null;
			
			String s2 = "chandru";
			
			System.out.println(s1.equals(s2)); // NullPointer Exception
			
	  }
	  
	 catch(NullPointerException V) {
		 
		 System.out.println("EXCEPTION HANDLED");
	 }
		
		
		
	}
	
	

}
