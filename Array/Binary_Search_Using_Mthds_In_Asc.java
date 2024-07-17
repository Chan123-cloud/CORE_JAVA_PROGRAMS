package Array;

import java.util.Scanner;

  public class Binary_Search_Using_Mthds_In_Asc {
	  
	  
	  
	  public static int BinarySearch(int[] arr, int start, int last, int SElement) {
		  
		  
		  while(start<= last) {
			  
			  int mid = (start + last)/2;
			  
			  
			  if (SElement > arr[mid]) {
				  
				  start = mid+1;
			  }
			  
              if (SElement < arr[mid]) {
				  
				  last = mid-1;
			  }
              
              if (SElement == arr[mid]) {
            	  
            	  return mid;
              }
				  
		  }
		  
		  return -1;
		  
		  
	  }
	  
	
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("ENTER THE SIZE OF THE ARRAY");
	
	
	int size = sc.nextInt();
	
	
	int arr[] = new int [size];
	
	
	int start = 0, last = arr.length;
	
	
	System.out.println("ENTER THE ELEMENTS IN THE ARRAY");
	
	
	for(int i =0; i<arr.length; i++) {
		
		arr[i] = sc.nextInt();
		
	}
	
	
	System.out.println("ENTER THE SEARCH ELEMENT FOR THE ARRAY");
	
	
	
	int SearchElement = sc.nextInt();
	
	
	
	 int index = BinarySearch(arr, start , last ,SearchElement);
	 
	 
	if(index == -1) {
		
		System.out.println("ELEMENT IS NOT PRESENT IN THE ARRAY");
	}
	
	else {
		
		System.out.println("ELEMENT IS PRESENT IN THE ARRAY"+index);
	}

}
	
}
