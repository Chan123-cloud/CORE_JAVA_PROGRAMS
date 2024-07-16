package Array;

import java.util.Arrays;

import java.util.Collections;

public class Sorting_Arr_In_Asc_Order {
	
	public static void main(String[] args) {
		
		Integer  b[] = {1,23,343,45,53,453,32,34,3};
		
	    Arrays.sort(b);    // Sorting all the Elements in the Array. 
	    
	    // Syntax works in primitive , Non-Primitive and as well as Wrapper Class.
		
		for( Integer i : b) {
			
			System.out.println(i);
		}
		
		System.out.println(Arrays.toString(b));
		
	
	}

}
