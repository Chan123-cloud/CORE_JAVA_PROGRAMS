package objectClassMethods;

import java.util.Objects;

public class Equals_obj_Method {

 String name ;
 
 double sal ;
 
 public Equals_obj_Method(String name, double sal) {
	 
		super();
		
		this.name = name;
		
		this.sal = sal;
	}
 
   public boolean  equals (Object obj) {  //  From the child class D ref is passed here to the parent class obj reference (object class)  UPCASTING
	 
	
	 Equals_obj_Method temp =( Equals_obj_Method)  obj;  // DOWNCASTING so we can access the both the class properties
	 
	 
	 if (this.name == temp.name  && this.sal == temp.sal) {
		 
		 return true;
		 
	 }
	 
	 else {
		 
		 return false;
	 }
		 
		 
	 }
	 
	
    
   public int hascode() {
		
		return Objects.hash(name,sal,name,sal);
	   
	   
   }

	 
 }
 
 



