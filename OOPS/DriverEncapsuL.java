package OOPS;

public class DriverEncapsuL {

	public static void main(String[] args) {
		
		EncapsuL A = new EncapsuL(21);
		
		
		 System.out.println(A.getAge());
		
	     A.Print1();
	     
	     A.setAge(30);
	     
	     System.out.println(A.getAge());
			
	     A.Print1();
	     
	     
		System.out.println();
		
		
		EncapsuL B = new EncapsuL(24 ,"Chandru");
		
		 System.out.println(B.getName());
			
	     B.Print1();
	     
	     B.setName("Ramu");
	     
	     System.out.println(B.getName());
			
	     B.Print1();
	    
		
	}

}
