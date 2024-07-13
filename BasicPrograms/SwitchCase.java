package BasicPrograms;

public class SwitchCase {
	
	public static void main(String[] args) {
		
		String a = "ChandraKumar";
		
		switch (a) {
		
		case "ram": {
			
			System.out.println(" His name is ram");
			
			break;
		}
		
		case "ChandraKumar":{  
			
			System.out.println("His name is Chandra kumar");
			
		                                        
		}                     // Without the break the case and default statements will print
		
		default :{
			
			System.out.println("His name is John");
		}
			
		}
	}

}
