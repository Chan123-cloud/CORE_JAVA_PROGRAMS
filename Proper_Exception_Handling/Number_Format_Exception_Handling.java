package Proper_Exception_Handling;

public class Number_Format_Exception_Handling {
	
	public static void main(String[] args) {
		
		try {
		
		String a ="true";            // Number format Exception happens doesnot given a proper value in string
		
		int  A = Integer.parseInt(a);         // It is a part of Ilegal format Exception.
		
		System.out.println(A);
		
	}
		
		catch(NumberFormatException Q) {
			
			System.out.println("Exception Handled");
		}

}
}
