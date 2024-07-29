package Customized_Exception;

public class Driver_Class {
	
	public static void Customize_Or_Not(int s)  {
		
		if(s>20000) {
			
			throw new Customized_Exception("We cant Customize");
		}
		
		else if(s<= 20000){
			
			System.out.println("We can Customize");
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		Customize_Or_Not(20000000);
		
	}

}
