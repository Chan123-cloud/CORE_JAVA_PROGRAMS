package InterviewQns;

public class StringSwap {
	
	public static void main(String[] args) {
		
		String a = "chandra";
		
		String b = "Kumar";
		
		String c ="";
		
		c = a;
		
		a = b;
		
		b = c;
		
		System.out.println(a);  // Using the third variable.
		
		System.out.println(b);
		
	
		
		
		
		
		
	    a = "chandra";
	    
	    b = "kumar";
	    
	    
	    a = a+b;
	    
	    System.out.println(a);
	    
	    
	    
	    b = a.substring( 0, a.length()  - b.length());  // without the third variable using the subset of a string.
	    
	    
	    System.out.println(b);
	    
	    
	    a = a.substring(b.length());
	    
	    
	    System.out.println(a);
	    
	  
		
	 
	}

}
