package InterviewQns;

public class Calling_Main_Method {
	
	
	static int count = 0;  // we can't declare the static keyword in the main method , but we can use the static variable to the main method.
    
    public static void main(String[] args)
    
    {                              
    	
    	count++;
    	
    	if(count<=2) {
    		
    	System.out.println("HI");
    	
    	 main(null); 
        
       
        
        
    }
    	
    
        System.out.println("THREEE TIMES WILL BE CALLED");
      
        
 
       
        
    }
    
    }

