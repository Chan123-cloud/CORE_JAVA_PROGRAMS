package Method_variable_Shadowing;

public class Driver_Class {
	
	public static void main(String[] args) {
		
              Class_A  A  = new Class_B();
              
             A.print();  // Here the ref class method will be executed.
             
             System.out.println(A.b);  // accessed the non static var in the static method by using the object.
                
	}

}
