package OOPS;

public class MethodOverloading { 

	public static void main(String[] args) {
		
		
		
		MethodOverloading. Operation("chandra" + 100);
		
		MethodOverloading. Operation("kumar");
		
		
		

	}
	

	public static void Operation(String a, int b) {  
		
		System.out.println(a);
		
		System.out.println(b);
		
		
	}
	
	public  static void Operation(String b ) {
		
		System.out.println(b);
		
		
		
	}
	
	
}
