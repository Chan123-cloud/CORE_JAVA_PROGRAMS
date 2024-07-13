package InterviewQns;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num = 6;                       // It is another way for finding the prime number.
		
		boolean exit = false;
		
		for( int i = 2; i<=num/2 ; i++) {
			
			if(num%i == 0) {
				
				exit  = true;
				
				break;
			}
		}
			
			if(!exit) {
				
				System.out.println("IT IS A PRIME NUMBER");
			}
			
			else {
				
				System.out.println("IT IS NOT A PRIME NUMBER");
			}
		}
		
	
}
