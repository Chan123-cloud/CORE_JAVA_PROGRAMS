package InterviewQns;

public class Recursion_of_fact_of_num {
	
    static   int fact = 1 ;// shared among all the methods  

	public static void main(String[] args) {

		 
		int num = 5;
		
		factorial(num);
		
		System.out.println(fact);
	
		
			}
	
	public static void factorial(int n) {
		
		if(n>=1) {
			
			fact = fact*n;
			
			factorial(n-1);
		}
		
		
	}
	
	



}
