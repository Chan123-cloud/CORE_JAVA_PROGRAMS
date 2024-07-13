package OOPS;

public class Encapsulation1 extends Encapsulation{
	
	
	public static void main(String[] args) {
		
		Encapsulation x = new Encapsulation ();
		
		//System.out.println(a); // Normally we can't access the private data even the class is Inherited.
		

		x.setA(123);  // By using methods we are setting the value to the private data.
		
		
		x.getA();   // Here we accessed the private data from the parent class by using the public method  (Encapsulation) 
		
		
		x.setS("RAGAV");
		
		
		System.out.println(x.getS());
		
		
		x.setB(false);  // 	It is a not initialized according to the rules
		
		
		
	   System.out.println(x.isB());
		
		 

	}

}
