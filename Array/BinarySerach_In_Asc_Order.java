package Array;

   import java.util.Scanner;

   public class BinarySerach_In_Asc_Order {
	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the Array");
		
		
		int size = sc.nextInt();
		
		
		int a[] = new int [size];
		
		
		int start = 0, last = a.length-1, mid =0, k =0;
		
		
		System.out.println("Enter the elements in the Array");
		
		
		for( int i=0; i<a.length; i++) {
			
			
			a[i] = sc.nextInt();
			
		}
		
		
		System.out.println("Enter the search element");
		
		int Search_Element = sc.nextInt();
		
		
		while (start <=last) {
			
			mid = (start + last)/2;
			
			if(Search_Element < a[mid]) {
				
				last = mid -1;
			}
			
			 if(Search_Element > a[mid]) {
				
				start = mid +1;
			}
           
			 if (Search_Element == a[mid]) {
				
				k = 1;
				
				break;
			}
			
		}
		
		
		if( k==1) {
			
			System.out.println("The Element is present in the Array"+mid); 
	
		}
		
		else {
	
			
			System.out.println("There is no Element in the Array");
		}
		
		
		
		
	}

}
