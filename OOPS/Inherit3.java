package OOPS;

public class Inherit3 extends    Inherit2 {
	
	public void hello() {
		
		super.hi(); // Class B method called.
		
		
		super.bye();  // Class A unique method called in class C
		
		int i = super.a;
		
		System.out.println(a);  // class A unique variable called in class C 
		
		
		super.WELCOME();  // Class B Unique method has called.
		
	
		
		
		System.out.println("HELLO LIVIN KUMARRR");
	}
	
   
   
    
	
	public static void main(String[] args) {
		
		Inherit3 a = new Inherit3(); 
		
		a.hi();
		
		a.hello();
		
	}

}
