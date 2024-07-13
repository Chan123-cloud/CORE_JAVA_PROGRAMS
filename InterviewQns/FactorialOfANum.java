package InterviewQns;

public class FactorialOfANum {
	
	public static void main(String[] args) {
		
		int num = 3;
		
		int fact =1;
		
		for (int i=1;i<=num; i++) {
			
			fact = fact*i;
			
		}
		
		System.out.println("The factor is"+" "+fact);
	}

}
