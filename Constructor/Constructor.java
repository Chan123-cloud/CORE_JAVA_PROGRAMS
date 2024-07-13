package Constructor;

import BasicPrograms.string;

public class Constructor {

	
    static	int a;   // Instance Variables
	 
	string b;  
	
	float c;
	
	char d;
	
	boolean e;
	
	
	public static void main(String[] args) {
		
		Constructor w = new Constructor(); // It is a Constructor as default it will assign the default values to the Instance variables.
		
		 System.out.println(a);  // calling the Instance variable by using the static keyword.
		 
		 System.out.println(w.b);  // calling the Instance variables by using the Constructor.
		 
		 System.out.println(w.c);
		 
		 System.out.println(w.d);
		 
		 System.out.println(w.e);
		 
}

}
