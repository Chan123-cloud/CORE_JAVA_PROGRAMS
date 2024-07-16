package Array;

import java.util.Scanner;

public class Bubble_Sort_In_Des_Order {

	public static void main(String[] args) {
		
		 	
			 Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter the size of the Array");
				
				int size = sc.nextInt();
				
				int a[] = new int [size];
				
				System.out.println("Enter the elements in the Array");
				
				for( int i=0; i<a.length; i++) {
					
					a[i] = sc.nextInt();
					
				}
				
				
				
				for( int i = 0 ; i<a.length-1; i++) {  // for  cycle
					
					for (int j = 0 ; j< a.length-i-1; j++) {    // for comparing the two elemnts
						
						
						if (a[j]<a[j+1]) {  
							
							int temp = a[j];   // Swapping
							
							a[j] = a[j+1];
							
							a[j+1] = temp;
						}
						
						
					}
					
				}
				
				System.out.println("THE DESCENDING BUBBLE SORTED ELEMENTS ARE");
				
				for(int i= 0 ; i<a.length;i++) {
					
					System.out.println(a[i]);
				}
				
				
				
				
			

		


	}

}
