package objectClassMethods;

public class Overriding_the_to_String {
	
	int a;
	
	String s ;

	
	public Overriding_the_to_String(int a,String s) {
		
		this.a = a;
		
		this.s = s;
	}
	
	
	public String  toString() { // This method is overrided from the object class (SAME METHOD NAME IN THE CHILD CLASS)
		
		

		return "Number is "+" "+ a +"\n"+ s;  //  State of the object
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		Overriding_the_to_String  B= new Overriding_the_to_String (10,"Chandra kumar M");
		
		System.out.println(B);  // It will call the to String method if it is there
		
		                        // If it is not there call the address of the child class
	}
}
