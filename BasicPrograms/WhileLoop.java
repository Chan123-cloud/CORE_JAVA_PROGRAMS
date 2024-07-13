package BasicPrograms;

public class WhileLoop {
	
	public static void main(String[] args) {
		
		int a = 1;
		
		while(a<=50) {
			
			
			if(a%2!=0) {
				
				System.out.println("odd numbers is :" +a);   // prints the all odd numbers from 1 to 50 
				
			}
			
			a++;
			
			
		}
		
		
		int b = 1 , c =10 ,  sum = 0;
		
		while (b<=c) {
			
           if(b%2!=0)   {               // Printing sum of  odd numbers from 1 to 10
           
			sum = sum +b ; 
        
           }
			
			
			b=b+2; 
			
		}
		
		System.out.println("The last number is"+sum);
		
		
		
		
  
  
    
	}

}
