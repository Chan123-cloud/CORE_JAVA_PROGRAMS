package Proper_Exception_Handling;

import java.util.IllegalFormatConversionException;

public class Illegal_Argument_Exception_Handling {
	
	public static void main(String[] args) {
		
	
	
	try {
		
    System.out.printf("%d", true);  // Illegal format Conversion Exception  % d is a format specifer
		
	}
	
	catch(IllegalFormatConversionException A) {
		
		System.out.println("Exception Handled");
		
		  
	}
	}

}
