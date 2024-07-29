  package Proper_Exception_Handling;

public class Class_Cast_Exception_Handling {
	
	
	public static void run()  throws ClassCastException {  // Here the exception throws to the caller method and handled by the caller.
		
        int a = 10;
		
		Object A = Integer.valueOf(a);  // risky statemrnt 
		
		
		String S = (String) A;
		
		
	}
	
	public static void main(String[] args) {
		
		try {
		
		run();
		
	}
		catch(ClassCastException Q ) {
			
			System.out.println("Exception Handled");
		}

}
}
