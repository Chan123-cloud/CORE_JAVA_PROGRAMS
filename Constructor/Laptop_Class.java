package Constructor;

public class Laptop_Class {
	
	String laptop_colour;
	
	int  Laptop_no;
	
    private Charger_Class C;   // Reference of the charger class
	
	public Charger_Class getCharger_Class() {
		
		return C;
	}
	
	 public Laptop_Class(String laptop_colour,int  Laptop_no, Charger_Class C ) {
		 
		  this.laptop_colour =laptop_colour;
		  
		  this.Laptop_no = Laptop_no;
		  
		  this.C = C;
		 
	 }
	
	
	
	
	
	

}
