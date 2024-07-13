package Constructor;

public class DefaultConstructor {
	
public DefaultConstructor() {
	
	this.b = "FAHAD FASIL";
	
	this.c = 123.456f;   // Default values are setting to the Instance variables 
		
		
	}

	public void print() {
		
		System.out.println(b +c);   //  Customized methods to print the Instance variables.
	}
	
	
	String b;  // Instance variables
	
	float c;
	

	
	public static void main(String[] args) {
		
		DefaultConstructor S = new DefaultConstructor();
        
		S.print();

	}

}
