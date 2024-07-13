package OOPS;

public abstract class  AbstractClassandMethods {
 
	private static int a ; 
	
	final String s = " chandru";
	
	boolean b = true;
	
	final static int  n =100;
	
	
	
	AbstractClassandMethods(){    // Constructor
		
		System.out.println("Abstract class constructor is called when child class object is created.");
		
		AbstractClassandMethods.a =10 ;
	}
	
	
	
	public abstract void name(); // Abstract method  declaration , Because will use whenever we need.
	
	
	
	public static int age() {
		
		return a;  // Static method
	}
	
	
	
	
	protected float percentage() {
		
		return 123.5343f;          // concrete method
	}        
	
	
	
}

