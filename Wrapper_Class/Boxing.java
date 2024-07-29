package Wrapper_Class;

public class Boxing {
	
	public static void main(String[] args) {
		
	
	int a = 100;        // Similar for the byte , short , long
	
	System.out.println(a);
	
	Integer a1=  Integer.valueOf(a);
	
	System.out.println(a1);
	
	
    byte b = 10;      // This will also possible
	
	System.out.println(b);
	
	Integer b1=  Integer.valueOf(b);
	
	System.out.println(b1);
	
	
	
	  char c ='a';
	
	 System.out.println(c);
	
	 Character c1 =Character.valueOf(c);
	
	 System.out.println(c1);
	 
	 
	 float f =1234.43f;    // Similar for the double
	
	 System.out.println(f);
	
	 Float f1 =  Float.valueOf(f);
	    
	 System.out.println(f1);
	 
	 
	 
	  boolean q =true;
	 
	  System.out.println(q);
	 
     Boolean q1 = Boolean.valueOf(q);
	
	System.out.println(q1);
	 
	 
	}
}
