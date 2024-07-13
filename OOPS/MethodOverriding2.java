      package OOPS;

public class MethodOverriding2  extends MethodOverriding1 {

	
	
	public  String  demo() {
			
			return "Livin Kumarr";
			
			
		}
		
		public static void main(String[] args) {
			
			
	MethodOverriding1 A = new MethodOverriding2 ();   /* Overriding normally call the child class method Even though it is inherited from the parent class. so it is called overridden method  */
			
		System.out.println(A.demo());  
		
		System.out.println(A.a);
		
		
         
			
	}
		
	}




