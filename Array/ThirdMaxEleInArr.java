package Array;

public class ThirdMaxEleInArr {
	
	public static void main(String[] args) {
		
		int e[] = {12,3,1,35,656,45,53,534,23};
		
		int FirstMax = Integer.MIN_VALUE;
		
		int SecondMax = Integer.MIN_VALUE;
		
		int ThirdMax = Integer.MIN_VALUE;
		
		for(int i: e) {
			
			if (i>FirstMax) {
				
				SecondMax = FirstMax;
				
				FirstMax = i;
					
			}
			
			else if ( i>SecondMax && i< FirstMax) {
				
				ThirdMax = SecondMax;
				
				SecondMax = i;
			}
			
			else if ( i>ThirdMax && i< FirstMax && i< SecondMax ) {
				
				ThirdMax = i;
			}
			
			
		}
		
		if ( ThirdMax == Integer.MIN_VALUE) {
			
			System.out.println("THER IS NO THIRD MAX ELEMENT IN THE ARRAY");
		}
		
		else {
			
			System.out.println("THE THIRD MAX ELEMENT IN THE ARRAY IS"+" "+ ThirdMax);
		}
	}
	

}
