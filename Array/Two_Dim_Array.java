package Array;

import java.util.Arrays;

public class Two_Dim_Array {
	
	public static void main(String[] args) {
		
		int a[][] = {{1,2,3},{4,5,6}};
		
		
		System.out.println("THE LENGTH OF THE EACH ROWS ARE");
		
		System.out.println(a[0].length);  // FOR PRINTING THE LENGTH OF EACH ROWS
		
		System.out.println(a[1].length);
		
		
		System.out.println();
		
		
		System.out.println("THE VALUES IN THE ARRAYS ARE");
		
		
	   for(int i = 0; i<a.length; i++) {     //  Iteration for the row
		   
		 
		 for( int j = 0 ;j<a[i].length; j++ ) {  // Iteration for the col
			 
			 
			 System.out.println(a[i][j]+" ");
		 }
		 
		 
		 System.out.println();
		 
		 
		 System.out.println(Arrays.toString(a[i]));
		 
		 
		 System.out.println();
	 }
	 
	}

}
