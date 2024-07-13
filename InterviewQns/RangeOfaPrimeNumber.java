package InterviewQns;

public class RangeOfaPrimeNumber {

	public static void main(String[] args) {
		
		int n = 45;
		
		
		
		for(int i = 11 ; i<=n; i++) {
			
			int count = 0;
			
			
		for(int j = 1 ; j<=i ; j++) {
			
			if(i%j==0) {
				
				count ++;
			}
		}
		
			
			if(count==2) {
				
				System.out.println("The Prime Numbers are"+" " + i);
			}
			
			}
		}	
		
		

	}



