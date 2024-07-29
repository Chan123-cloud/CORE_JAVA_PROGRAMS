package Customized_Exception;

public class Driver_Class2 {
	

		
	
	
	public static void main(String[] args) {
		
		String s ="ram";
		
		String k= "sam";
		
		
	if(s.equalsIgnoreCase(k)) {
			
			System.out.println(true);
		}
		
		else {
			
			throw new Name_Not_Found_Exception("false");
		}
	
	
		}
		
	
				
			}
			
			
		
	


