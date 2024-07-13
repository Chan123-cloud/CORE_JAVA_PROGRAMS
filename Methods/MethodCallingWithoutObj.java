package Methods;

public class MethodCallingWithoutObj {
	
	public static int SUB (int a, int b) {
		
		
		
		int c = a-b;
		
		return c;
		
	}

	public static void main(String[] args) {
		
		System.out.println(MethodCallingWithoutObj.SUB(3, 4));
		
		System.out.println(MethodCallingWithoutObj.(SUB(10,3));
		
		

	}

}
