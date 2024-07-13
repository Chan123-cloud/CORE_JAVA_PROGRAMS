package OOPS;

public class Basic_Inheritance {
	
	private int a ;
	
	static int b ;
	
	int c ;
	
	static {                    // Multi_line Static Initializer
		
		System.out.println(b);
	}

	
	
	{                           // Multi_line non static Initializer
		
		System.out.println(a);
		
		System.out.println(c);
	}
	
	
    public void print() {
	
	System.out.println(a+b+c);
	
   }
    
    Basic_Inheritance (int a , int b ,int c)  {
    	
    	this.a = a;
    	
    	this.b = b;
    	
    	this.c = c;
    }

}
