package Array;

import java.util.Arrays;

import java.util.Collections;

public class Sorting__Char_Arr_Elements_In_Des {
	
	public static void main(String[] args) {
		
		Character c[] = {'w','1','E','$'};
		
		Arrays.sort(c,Collections.reverseOrder());
		
		for(Character d: c) {
			
			System.out.println(d);
		}
	}

}
