package Constructor;

public class Car_Constructor_Overloading_and_Chaining {
	
  String brand;
  
  String colour ;
  
  int price;
  
  Car_Constructor_Overloading_and_Chaining(){
	  
  }
  
  
  
  
 Car_Constructor_Overloading_and_Chaining(int price){
	 
	 this.price = price;  // after came initialize the values(NSI) , execute the NSI and then to called constructor
	  
  }
 
 
 
 
 Car_Constructor_Overloading_and_Chaining(String brand){
	 
	 this.brand= brand;
	  
 }
 
 
 
 Car_Constructor_Overloading_and_Chaining(String brand , int price){
	 
	 this.brand  = brand;
	 
	 this.price = price;
	  
 }
 
 
 
 
 Car_Constructor_Overloading_and_Chaining(String brand , String colour){               
	 
	 this(colour);  // here there is no color constructor individually so color will not print
	 
	 this.brand  = brand; // Only brand will print
	 
	 
	  
 }
 
 
 
 
 Car_Constructor_Overloading_and_Chaining( int price , String colour ){   // 	CONSTRUCTOR CHAINING  It will call only once in a constructor at first statement//  
	 
	 this(price);  // go upto price constructor
	 
	 this.colour = colour;  // after execute the NSI , move to PWI
	 
	 
	  
 }
 
 
 
 public void Print() {
	 
	 System.out.println(price +" "+brand+" "+colour);
 }
 
 
 
 
  
  
  
  
  
  
  

}
