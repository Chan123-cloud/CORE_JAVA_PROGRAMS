package InterviewQns;

public class FactorialRange {
	
	public static void main(String[] args) {
		
		for(long i = 1; i<=20 ; i++) {
			
			System.out.println(Factorial(i));
			
		}
	}
	
	public static long Factorial(long j) {
		
		long fact =1;
		
		while (j>0) {
			
			fact =fact*j;
			
			j--;
		}
		
		
		return fact;
		
		
	}
		
	}
		
	