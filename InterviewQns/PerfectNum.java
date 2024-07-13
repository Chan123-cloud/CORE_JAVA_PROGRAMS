package InterviewQns;
   
/* for the perfect number - if it is 15  factor of number (15) - 1 ,3 , 5 , 15   here neglect 15

  there is trick -  for even number the factors are half of the number    

 for odd number will be less than half of its number.
 
 then the factors want to be add   (except the  input number )
 
 sum of factors = = input ( perfect Number)

                                                      */

public class PerfectNum { 

	public static void main(String[] args) {
	
		int n = 12;
		
		int sum = 0 ; 
		
		int t = n;
		
		for(int i = 1 ; i<=n-1; i++) {  // or i<=n/2    because even number will come half of its.   AND  odd number will be less than half of its number.
			
			if((n%i==0)){
				
				sum = sum +i;
				
			}
		}
			
			System.out.println(sum);
			
			if(t==sum) {
				
				System.out.println("It is a perfect number");
			}
			
			else {
				
				System.out.println("It is not a perfect number");
			}
		}
	}

	


