package Methods;

public class IsEvenOrOdd {
	
	
	public static  boolean  IsEven(int b) {
		
		return b%2==0;	// 0 = = 0 boolean true as output even method will print.
	

	}
		
		public static boolean  IsOdd(int b) {  // 0 != 0 boolean true as output odd method will print.
			
			return b%2 != 0;
	
		}

	public static void main(String[] args) {
		
		int a = 12;
		
		
		IsEven(a);
		
		IsOdd(a);
		
	if(IsEven(a)) {
		
		System.out.println("it is even number");
			
			
		}
	
	if (IsOdd(a)){
		
		System.out.println("It is a odd number");
	}
		
	
	}
}
