package Constructor;

import BasicPrograms.string;

public class Basic_Programs {
	
	
	
	static int a;
	
	String s ;
	
	{
		int d = 0 ;  // it is also method  and variable is local.
		
		System.out.println(a+" "+s+" "+d);
	}
	
	public  Basic_Programs(int a , String s) {
		
		this.a = a;
		
		this.s = s;
		
	}
	
	public void print() {
		
		System.out.println(this.a +" "+this.s);
	}

	public static void main(String[] args) {
		
		Basic_Programs A = new Basic_Programs(10,"chandru");  // 1.Values will be loaded for NSM (NSV and NSM)  
		
		A.print();                                           // 2.execute the SLNSI AND MLNSI
		
		                                                    //  Then the PWI which means of the constructors and methods
			
		
		
		

	}

}
