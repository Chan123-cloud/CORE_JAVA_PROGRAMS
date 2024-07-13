package BasicPrograms;

public class Continue {

	public static void main(String[] args) {
		
		int a = 10, b = 20;
		
		for (a = 10 ; a <=b ; a++) {
			
			if(a==12) {
				
				continue;  // It will omit only the 12.
			}
			
			if(a%2==0) {
				
				System.out.println(a);
				
			}
			
		}

	}

}
