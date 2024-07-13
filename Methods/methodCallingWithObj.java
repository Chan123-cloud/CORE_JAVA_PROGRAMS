package Methods;

public class methodCallingWithObj { 
	
	int c =100;
	
	int k =120;  // Instance Variables we can use outside of the main method
	
	public int ADD (int a, int b) {
		
		
		int c = a+b;
		
		return c;
		
	}
	
   public int SUB () {
		
		
		
		int d = c-10;
		 
	
		
		return d;
		
	}
		
  
	public static void main(String[] args) {
		
		
       methodCallingWithObj a = new methodCallingWithObj();
		
		System.out.println("THE VALUE IS : "+ a.ADD(2,4));
	
		System.out.println(a.SUB());
		 
		
		
	}


}
