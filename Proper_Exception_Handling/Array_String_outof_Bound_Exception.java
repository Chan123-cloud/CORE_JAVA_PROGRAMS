package Proper_Exception_Handling;

public class Array_String_outof_Bound_Exception {
	
	
public static void main(String[] args) {
	
		try {     // Array
			
		char a[] = new char[2];
		
		a[0] ='w';
		
		a[1] = 'd';
		
		a[2] = 'c';
		
		System.out.println(a[2]);
		
		}
		
		catch (ArrayIndexOutOfBoundsException Q) {
			
			System.out.println("EXCEPTION HANDLED");
		}
		
		
		try {   // String
			
			String s =" chandru";
			
			System.out.println(s.charAt(-2)); // String out of Bound Exception Occurs Either the size can be negative or the lenght is out 
			
			
		}
		
		catch(Exception U) {
			
			System.out.println("EXCEPTION HANDLED");
		}
		
		finally {
			
			System.out.println("BOTH ARRAY AND STRING EXCEPTIONS ARE HANDLED");
		}
		
		
	}

}
