package Proper_Exception_Handling;

public class Interrupted_Unchecked_Exception {
	
	public static void main(String[] args) throws InterruptedException   {  // Jvm get the exception and handled by the default exception handler
  		
		System.out.println("hi");
		
		
	
		Thread.sleep(3000);
			
				
			
		
		
		System.out.println("hello");
		
	}

}
