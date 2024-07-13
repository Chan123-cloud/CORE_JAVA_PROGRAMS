package THISAndSuper;

public class ThisAndSuperKeyword {
	
	
	public static void hi() {
		
		System.out.println("HI CHANDRA KUMAR");
	}
	

	protected void hello()  {
		
		this.hi();  // It will call the method of same class
		  
		System.out.println("HELLO RANJITH KUMAR");
	}
	
	
	public static void main(String[] args) {
		
		ThisAndSuperKeyword A = new ThisAndSuperKeyword();
		
		A.hello();
		
		
		
	}

}
