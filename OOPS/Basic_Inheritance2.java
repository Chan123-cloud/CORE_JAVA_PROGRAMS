package OOPS;

public class Basic_Inheritance2 extends Basic_Inheritance {

	Basic_Inheritance2(int a, int b, int c, String q) {  // I have called the constructor of the parent class in the child class.
		
		super(a, b, c);
		
		this.q = q;
		
		
		
	}
	
	
	
    String q;
    
    String d = "LIVIN KUMARR VP";
    
    static String g ="RAVI PRAKASH VP";
    
    public void print1() {
    	
    	System.out.println(q+" "+b+" "+g);
    }
	
	

}
