package Array;

public class ThirdMinEleInArr {
	
	public static void main(String[] args) {
		
			
			int e[] = {23,4,545,65,64,23,5,12,67,21};
			
			int FirstMin = Integer.MAX_VALUE;
			
			int SecondMin = Integer.MAX_VALUE;
			
			int ThirdMin = Integer.MAX_VALUE;
			
			for(int i: e) {
				
				if (i<FirstMin) {
					
					SecondMin = FirstMin;
					
					FirstMin= i;
						
				}
				
				else if ( i<SecondMin && i>FirstMin) {
					
					ThirdMin = SecondMin;
					
					SecondMin = i;
				}
				
				else if ( i<ThirdMin && i>FirstMin && i>SecondMin ) {
					
					ThirdMin = i;
				}
				
				
			}
			
			if ( ThirdMin == Integer.MIN_VALUE) {
				
				System.out.println("THER IS NO THIRD MIN ELEMENT IN THE ARRAY");
			}
			
			else {
				
				System.out.println("THE THIRD MIN ELEMENT IN THE ARRAY IS"+" "+ ThirdMin);
			}
		}
		

	}


