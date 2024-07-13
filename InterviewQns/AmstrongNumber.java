package InterviewQns;

public class AmstrongNumber {
	
	public static void main(String[] args) {
		
		int num = 153;
		
		int temp = num;
		
		int sum = 0 ;
		
		int rem = 0 ;
		
		while(num>0) {
			
			rem = num%10;
			
			sum = sum+rem*rem* rem;
			
			num = num/10;
		}
		
		if(sum==temp) {
			
			System.out.println("IT IS A AMSTRONG NUMBER");
		}
		
		else {
			
			System.out.println("IT IS NOT A AMSTRONG NUMBER");
		}
	}

}
