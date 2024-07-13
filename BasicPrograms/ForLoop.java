package BasicPrograms;

public class ForLoop {
	
	
	public static void main(String[] args) {
		
		
		int i= 1,  j=5 , k = 10;
		
		for (i=1 ; i<=j  ; i++    ) {     // Printing the names
			
			System.out.println(" chandra kumar");
		}
		
		
		
		
		for (i = 1 ; i<=k ; i++) {
			
			System.out.println(i);   // printing 1 to 10
		}
		
		
		
       for (i=1 ; i<=k; i=i+2 ) {  // initialize , checks the condition , loop executes ,  then the update the i value
    	   
    	   System.out.println(i);   // odd numbers  
    	   
    	   
       }
	}

}
