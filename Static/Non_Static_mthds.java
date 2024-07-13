package Static;

public class Non_Static_mthds {
	
	static int a =10;
	
	double d =21232.33223;
	
	public void print() {
		
		Non_Static_mthds A= new Non_Static_mthds (); // Created object for the customized non static methods.
		
		System.out.println(A.d);
		
		System.out.println(A.a);
	}

	public static void main(String[] args) {
	
		Non_Static_mthds B = new Non_Static_mthds();
	
		B.print();
	}

}
