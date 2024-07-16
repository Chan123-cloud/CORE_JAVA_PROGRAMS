package Array;

import java.util.Scanner;

  public class LinearSearch {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the Array");
		
		int size = sc.nextInt();
		
		int a[] = new int [size];
		
		System.out.println("Enter the elements in the Array");
		
		for( int i=0; i<a.length; i++) {
			
			a[i] = sc.nextInt();
			
		}
		
		int searchElement = 40; int k = 0;
		
		
		for(int i = 0 ; i<a.length;i++) {
			
			if(searchElement == a[i]) 
				
				System.out.println(i);  // For finding the position val in the Array
				
				k=1;
			
		}
		
			
			if( k==1) {
			
				System.out.println("The Element is present in the Array"); 
		
			}
			
			else {
		
				
				System.out.println("There is no Element in the Array");
			}
			
		}


	}


