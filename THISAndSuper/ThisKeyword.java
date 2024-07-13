package THISAndSuper;

public class ThisKeyword {
	
	int a ;
	
	static String b ;
	
	
	public void GetVal(int a , String b) {
		
		this.a = a;
		
		this.b = b;
		
		System.out.println(a);
		
		System.out.println(b);
		
		
	}
	
	public static void main(String[] args) {
		
		ThisKeyword A = new ThisKeyword();
		
		System.out.println(A);
		
		A.GetVal(10 ,"CHANDRU");
		
		
		ThisKeyword  B = new ThisKeyword();
		
		System.out.println(B);
		
		B.GetVal(20 , "RAMU");
		
		
		
		
	}

}
