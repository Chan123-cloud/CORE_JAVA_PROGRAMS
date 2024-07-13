package Constructor;

public class CopyConstructor {

	 int  age;
	
	 String s;
	
	
	 public CopyConstructor(int i , String h){    // Parameterized Constructor
		
		age = i ;  // Storing the values through the variables.
		
		s = h ; 
		
	}
	
	public CopyConstructor(CopyConstructor w){       // CopyConstructor
		
		age = w.age;   // Storing the values through the reference of the object.
		
		 s = w.s;
		
	}
	
	public void Print() {         // Method for the parameterized constructor
	
		System.out.println(s +" "+ age );
	
	}
	
	public void Print1() {
		
		System.out.println(s +" "+ age) ;
	}
	
	
	
	public static void main(String[] args) {
		
		CopyConstructor j = new CopyConstructor(22,"CHANDRA KUMAR M");  // Passing the values in object.
		
		CopyConstructor k = new CopyConstructor(j);  // Passing the object  in object
		
		j.Print();
		
		k.Print1();
		
		
	
		

	}

}
