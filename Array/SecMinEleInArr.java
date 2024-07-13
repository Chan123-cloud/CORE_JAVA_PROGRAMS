package Array;

public class SecMinEleInArr {
	
	public static void main(String[] args) {
		
		int [] b = {1,23,34,21,6,8};
		
		int FirstMin = Integer.MAX_VALUE;
		
		int SecondMin = Integer.MAX_VALUE;
		
		for ( int i =0; i<b.length; i++) {
			
			if (b[i] < FirstMin) {
				
				
				SecondMin = FirstMin;
				
				FirstMin = b[i];
				
			}
			
			else if (b[i]< SecondMin && b[i]> FirstMin) {
				
				SecondMin = b[i];
			}
		}
		
		if (SecondMin == Integer.MAX_VALUE) {
			
			System.out.println("THER IS NO SECOND MIN ELEMENT IN THE ARRAY");
			
		}
		
		else {
			
			System.out.println("THE SECOND MIN ELEMENT IS"+" "+SecondMin);
		}
	}

}
