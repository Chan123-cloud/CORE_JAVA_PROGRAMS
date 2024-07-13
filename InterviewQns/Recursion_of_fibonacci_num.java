package InterviewQns;

public class Recursion_of_fibonacci_num {
	
	static int a=0, b=1,c;
	
	public static void main(String[] args) {
		
		int h = 10;
		
		System.out.println(a);
		
		System.out.println(b);
		
		fibonacci(h-2);
		
	}
	
    public static void fibonacci(int j) {
	 
	 if(j>=1) {
		 
		 c =a+b;
		 
		 System.out.println(" "+ c);
		 
		 a=b;
		 
		 b=c;
		 
		 fibonacci(	j-1);	 
	 }
 }
	
}