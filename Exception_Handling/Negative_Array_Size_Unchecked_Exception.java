package Exception_Handling;

public class Negative_Array_Size_Unchecked_Exception {
	
	public static void main(String[] args) {
		
		int a[] = new int [-3];
		
		a[0] =10;
		
		System.out.println(a[0]);
		
	}

}
