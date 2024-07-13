package OOPS;

public class AbstractChildClass extends AbstractClassandMethods {
	
		
		
	
	public void name() {
	
		super.percentage();
		
		
		System.out.println("CHANDRA KUMAR M");    //  Abstract method has defined
		
	}

   
  public static void main(String args[]) {
		
		AbstractClassandMethods a = new  AbstractChildClass();
		
		a.name();
		
		System.out.println(a.s);
		    
		System.out.println(a.b);
		
		System.out.println(AbstractClassandMethods.age());
		
		System.out.println(a.percentage());
	}
	
	


}

