package Exception_Handling;

public class Class_Cast_UncheckedException {
	
	public static void main(String[] args) {
		
		int a = 10;
		
		Object A = Integer.valueOf(a);
		
		
		String S = (String) A;  // we cant convert Integer into an string  ... because String is not a sub class of Integer
	}

}                             //  Under the String all the objects like Integer, boolean 
