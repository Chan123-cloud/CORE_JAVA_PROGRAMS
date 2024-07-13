package Static;

public class Static_var_Static_blck {

	static int a =100;   // first initialize from 0 to 100
	
	static String str ="chandra kumar";  //null to String
			
	public static void main(String[] args) {
		
		int e =30;  // Second Initialize
		
		System.out.println("HE IS A SOFTWARE TESTER");  // execute after the static block
	

	}
	
	static {    // Execute at first
		
		System.out.println(a);
		
		System.out.println(str);
		
		System.out.println("HI CHANDRA KUMAR");
	}

}
