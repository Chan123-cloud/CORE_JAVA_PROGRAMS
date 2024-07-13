package BasicPrograms;

public class Driver_Casting {
	
	public static void main(String[] args) {
		
		Upcasting_And_DownCasting1 A = new Upcasting_And_DownCasting1(22,"CHANDRU M");
		
		System.out.println(A.name);
		
		System.out.println(A.roll);
		
		
		// For Generalization we are casting.
		
	// UPCASTING SO HERE WE CANT ACCESS THE CHILD CLASS MEMBERS IN THE PARENT CLASS.
				
	
		// here only accessed the parent class members , not a child.
			
		 Upcasting_And_DownCasting B = A; 
	
		
		 System.out.println(B.name); 
		
		
		
		 // over come this defect we will go for the DOWNCASTING.
		
		 // Again we have DOWNCASTING then we can use the both parent and the child class members in child class.
		 
		 
		  
		 Upcasting_And_DownCasting1 S = ( Upcasting_And_DownCasting1) B; 
		  
		 System.out.println(S.name);
		 
		 System.out.println(S.roll);
		 
		 
		  
		 
		  // THESE THREEE STEPS rules TO FOLLOW FOR THE UPCASTING TO THE DOWNASTATING
		  
		  // Create a object  for child and assign it to the child.
		  
		  // then upcast.(only parent class members)
		  
		  // then downcast.(Both parent and the child class members can access here.
		  
		  //These three steps are Compulsory.
		 
		 
		  
         // Instsance of operators 
		 
		 // The cls is accessable it will return true if it is not then return false.
		 
		 // For this operation mustr have to be follow the rules of upcasting and the Downcasting.
		 
		 
		 System.out.println(A instanceof Upcasting_And_DownCasting1 ); // child cls ref and child cls name.
		 
		 System.out.println(B instanceof Upcasting_And_DownCasting); // par cls ref and par cls name.
		 
		 System.out.println(B instanceof Upcasting_And_DownCasting1 ); // par cls ref and par cls name. Due to upcasting.
		 
		 // only class can be accessed not a varibles and the methods.
		 
		 System.out.println(S instanceof Upcasting_And_DownCasting); //  new child cls ref and par cls name
		 
		 System.out.println(S instanceof Upcasting_And_DownCasting1); // new child cls ref and child cls name Due to downcasting.
		 
		
	}

}
