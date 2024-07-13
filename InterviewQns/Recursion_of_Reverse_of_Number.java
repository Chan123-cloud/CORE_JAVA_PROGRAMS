package InterviewQns;

public class Recursion_of_Reverse_of_Number {  // Method calls itself again and again is known as Recursion.
	
	public static void main(String[] args) {
		
		int num =123445;
		
		reverse(num);
		
	}
	
	public static void reverse(int n)
	
	
	{
		if(n<10) {
			
			System.out.println(n);
			
			 
		}
		
		else {
			
			System.out.print(n%10); // The cursor will be only her until the last Iteration
			
			reverse(n/10);
		}
		
		
		
		
	}
}
