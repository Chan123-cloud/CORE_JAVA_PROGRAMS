package Methods;

public class MethodCalling1 {
	
	public static void main(String[]args) {
		
		MethodCalling m = new MethodCalling();
		
		
		int s = m.Num('A');  // Character is passed in method and automatically converted into the character into the integer.
		
	    System.out.println(s);
	    
	    System.out.println( m.Eating()); 
	    
	    m.JustPrint();
	    
	    System.out.println(m.w);
	    
	    System.out.println(m.a);
	    
	 
	

}
  
	
	

}