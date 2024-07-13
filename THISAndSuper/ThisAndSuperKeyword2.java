package THISAndSuper;

public class ThisAndSuperKeyword2 extends ThisAndSuperKeyword{
	
   public static void hi() {
	   
		System.out.println("HI RAM KUMAR");  // In static we can't able to use the this and super keyword.  // we can't call non static variable in static methods
		  
	}
 
   
   protected void hello()  {
	   
	  super.hi();  // // It will call the method of parent class  // we can call static method in non static methods
	  
	System.out.println("HELLO RANJITH KUMAR");
}

   
	public static void main(String[] args) {
		
		ThisAndSuperKeyword2 B = new ThisAndSuperKeyword2();
		
		B.hello();

	}

}
