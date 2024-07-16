package Array;

import java.util.Scanner;

public class Lin_Ser_By_Using_mthds {
	

	
	public static int LinearSearch(int arr1[] , int SElement) {
		
		for( int i = 0 ; i<arr1.length; i++ ) {
			
		
			if(SElement == arr1[i]) {
				
				
				return i;
		}
					
		}
		
		return -1;
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("ENTER THE SIZE OF THE ARRAY");
		
		int size = sc.nextInt();
		
		int arr[] = new int [size];
		
		System.out.println("ENTER THE ELEMENTS IN THE ARRAY");
		
		for( int i = 0; i<size; i++) {
			
			arr[i] = sc.nextInt();
		}
		
		
		 System.out.println("ENTER THE SEARCH ELEMENT FOR FINDING THE ELEMENTS IN THE ARRAY"); 
		
		 int SearchElement = sc.nextInt();
		
		 int index = LinearSearch(arr, SearchElement);
		 
		 if (index == -1) {
			 
			 System.out.println("THE ELEMENT IS NOT PRESENT IN THE ARRAY");
		 }
		 
		 else {
			 
			  System.out.println("THE ELEMENT IS PRESENT IN THE ARRAY"+" "+index);
		 }

	}

}
