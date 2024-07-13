package Methods;

public class TypecastingIntheMethods {
	
	
	static int sub(int c,int d) {
		
		int w = c-d;
		
		return w;
	}
	
	
	public static void main(String[] args) {
		
		
		double a = 123.45;
		
		double b = 23.434;
		
		int c = sub((int)a , (int)b);  // double converted into double into integer.
		
		System.out.println(c);
		
		
	}

}
