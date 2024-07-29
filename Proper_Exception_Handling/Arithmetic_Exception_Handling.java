package Proper_Exception_Handling;

public class Arithmetic_Exception_Handling {
	
	public static void main(String[] args) {
		
		
		try {    // Critical statemnt
			
		int a =10; int b =0;
		
		int c= a/b;    // Arthimetic Exception
		
		System.out.println(c);
		
		}
		
		catch(ArithmeticException E) {
			
			System.out.println("EXCEPTION HANDLED");
		}
		
		finally {
			
			System.out.println("PROCESS COMPLETED");
		}
		
	
		
		
	}

}
