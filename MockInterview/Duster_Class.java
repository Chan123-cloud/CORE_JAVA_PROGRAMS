package MockInterview;

public class Duster_Class {
	
	boolean Is_Duster_rub;

	String Rubness_of_duster;
	
	int Duster_size;
	
	
	  Duster_Class (int Duster_size) {
			
	   this.Duster_size = Duster_size;
	   
		}
	

	  Duster_Class (boolean Is_Duster_rub) {
		
		this.Is_Duster_rub = Is_Duster_rub;
	}
	  
	  
      Duster_Class(String Rubness_of_duster ) {
		
		this.Rubness_of_duster = Rubness_of_duster;
	}
	
	

	
	
      Duster_Class (boolean Is_Duster_rub , String Rubness_of_duster) {
    	
    	this(Rubness_of_duster);   // Constructor  chaining
    	
		this.Is_Duster_rub = Is_Duster_rub;
	
	}
    
    
    
      Duster_Class (int Duster_size , boolean Is_Duster_rub ){
    	
    	     this(Is_Duster_rub);
         
             this.Duster_size = Duster_size;
           
          
    }
    
    
      Duster_Class (String Rubness_of_duster , int Duster_size  ){
    	
    	      this(Duster_size);
    	      
    	      this.Rubness_of_duster = Rubness_of_duster;
    	
    	
    }
    
    public void Print() {
 	   
 	   System.out.println(Is_Duster_rub +" "+ Rubness_of_duster+" "+Duster_size);
    }






    
    
}

