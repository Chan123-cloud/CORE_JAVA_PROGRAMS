package Method_variable_Shadowing;

public class Class_C extends Class_B {
	

	static int a =10;    // VARIABLE SHAWDOWING
	
    static int b =5;
    
    int c =5000;
	
	
	public static  void print() {     // METHOD SHAWDOWING
		
		System.out.println(a+b);
	}

}
