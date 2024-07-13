package Constructor;

public class Laptop_Driver_Class {
	
	public static void main(String[] args) {
		
		Laptop_Class  L = new Laptop_Class("Grey", 2312 , new Charger_Class("A- type"));
		
		
		// I created the charger class obj in the Laptop class.
		
		
		
		System.out.println(L.laptop_colour);
		
		
		System.out.println(L.Laptop_no);
		
		
		L.getCharger_Class().SetCharger("S- TYPE"  ); // Through address of the charger class I am setting the value for the  charger (Indirecly).
		
		
		System.out.println(L.getCharger_Class().GetCharger_type()); // I accessed the charger class address by using this 
		                                                      
		
		                                                             // I called the get method of the charger class.
		
	}

}
