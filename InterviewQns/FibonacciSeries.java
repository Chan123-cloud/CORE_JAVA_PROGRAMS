package InterviewQns;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		int input  = 12; 
		
		int a =0 , b =1, c=0;
		 
		
		System.out.println(a);
		
		System.out.println(b);
		
	
		
		for(int i =3; i<=input ; i++) {
			
			c = a+b;
			
			System.out.println(c);
			
			a=b;
			
			b=c;
			
			
		}
		
		
		
	}

}
