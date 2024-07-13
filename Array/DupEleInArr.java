package Array;

public class DupEleInArr {
	
	public static void main(String[] args) {
		
		int b [] = { 10,22,45,22,434,22,10,12,10};
		
		int count = 0;
		
		System.out.println("THE DUPLICATE ELEMEMTS ARE");
		
		for (int i = 0 ; i< b.length; i++) {
			
			for (int j =i+1; j<b.length; j++) {
				
				if (b[i]== b[j]) {
					
					System.out.println(b[j]);
					
					count ++;
					
					
				}
			}
		}
		
		System.out.println("THE COUNT OF THE DUPLICATE ELEMENTS ARE"+" "+count);
	}
	

}
