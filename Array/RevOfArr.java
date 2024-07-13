package Array;

public class RevOfArr {
	
	public static void main(String[] args) {
		
		int c[] = {212,32,32,4,3423,124,45,11};
		
		for(int j : c) {                       // Orginal
			
			System.out.println(j);
		}
		
		System.out.println();
		
		
		for (int k = c.length-1; k>=0; k--) {   // Reverse
			
			System.out.println(c[k]);
		}
	}

}
