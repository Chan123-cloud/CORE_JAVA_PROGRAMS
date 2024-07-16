package Array;

import java.util.Arrays;

import java.util.Collections;

public class Sorting_Arr_In_Des_Order {
	
	
	public static void main(String[] args) {
		
		String[]a = {"Ant","Cockrocah","Butterfly","Catterpillar"};  
		
		Arrays.sort(a,Collections.reverseOrder());  // This Syntax works only in the non primitive and wrapper class
		
		for(String b:a) {
			
			System.out.println(b);
		}
	}

}
