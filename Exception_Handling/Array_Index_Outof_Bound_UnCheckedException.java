package Exception_Handling;

public class Array_Index_Outof_Bound_UnCheckedException {
	
	
	public static void main(String[] args) {
		
		char a[] = new char[2];
		
		a[0] ='w';
		
		a[1] = 'd';
		
		a[2] = 'c';
		
		
		System.out.println(a[2]);
		
	}

}
