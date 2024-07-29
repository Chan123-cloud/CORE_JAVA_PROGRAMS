package Throw_In_Exception_Handling;

public class A1_by_try_and_Catch {
	
public static void main(String[] args) {
	
		try {
			
		
		System.out.println("THis one will Execute");
		
		throw new ClassCastException("Exception is created"); // I created the Exception here without any class cast logic
		
		}
		
		catch(Exception E) {
			
			System.out.println("Exception handled");
		}
}

}
