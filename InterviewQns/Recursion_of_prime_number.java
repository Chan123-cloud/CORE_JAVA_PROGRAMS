package InterviewQns;

public class Recursion_of_prime_number {
	
	static int a =6;
	
	 static int count = 0;

	public static void main(String[] args) {
		
		CheckPrime(a,2 );
			 
		
	}
	
	private static void CheckPrime(int b, int i) {
		
		
	
		
		CheckPrime(b, i+1);
		
	}
	}


		
	


