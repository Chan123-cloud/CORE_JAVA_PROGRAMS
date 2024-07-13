package Static;

public class InsAndLocVar {

	int a = 10;
	               // Instance Variables
	 int b = 20;
	
	 void PRI(int a) {
		 
		 int z=10;
		 
		 System.out.println(a);  // local variable value
		 
		 System.out.println(b);  // Instance variables value
	 }
	 
    void PRI(int a,int b) {
		 
		 System.out.println(this.a);
		 
		 System.out.println(this.b);  // this keyword is used to access the instance variablesn and holds the reference of the object
		 
		
	 }
	 
	public static void main(String[] args) {
		
		InsAndLocVar a = new InsAndLocVar();
		
		a.PRI(11);
		
		a.PRI(213, 345); 
		
	
		
	}
}
