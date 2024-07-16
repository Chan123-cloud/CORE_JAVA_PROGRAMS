package Array;

import java.util.Arrays;

public class Sorting_subArray_Elements_In_Asc {
	
	public static void main(String[] args) {
		
	int s [] = {10,20,43,454,3,4535,3,43,42};
	
		
		Arrays.sort(s,2,s.length);   // Sorting the Sub Array Elements in the Array. 
		
		// Syntax works in the Primitive, Non-Primitive and as well as Wrapper class.
		
		
		for(int   j : s) {
				
				System.out.println(j);
			}
			
				
		
	}

}
