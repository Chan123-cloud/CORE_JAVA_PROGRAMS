package Constructor;

public class Car_Driver_Class {
	
	public static void main(String[] args) {
		
		Car_Constructor_Overloading_and_Chaining A = new Car_Constructor_Overloading_and_Chaining (400000);
		
		A.Print();
		
        Car_Constructor_Overloading_and_Chaining B = new Car_Constructor_Overloading_and_Chaining ("BMW", "grey");
		
		B.Print();
		
       Car_Constructor_Overloading_and_Chaining C= new Car_Constructor_Overloading_and_Chaining ("BLACK");
		
		C.Print();
		
	  Car_Constructor_Overloading_and_Chaining D= new Car_Constructor_Overloading_and_Chaining (220000 , "FERRAI");
			
	   D.Print();
		
	}

}
