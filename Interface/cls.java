package Interface;

public class cls implements Interface1 , Interface2{
	
	
	public void hi() {
	

		System.out.println(" HI CHANDRA KUMAR");
		
		System.out.println(a);
		
	}

	
	public void HI() {
	
		System.out.println("WELCOME TO THE TESTING");
		
		System.out.println(b);
		
	}
	
	

	public static void main(String[] args) {
		
		cls c = new cls();
		
		c.hi();
		
		c.HI();
		
		System.out.println(s); 
		
	}
		
	}


