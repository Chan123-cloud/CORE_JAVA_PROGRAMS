package Static;

public class StaticAndNonStaticVar {

	
	int a = 100;  // Instance variable  // Reinitialize from the first
	
	static int b = 100;  // Static variable  only one copy for that class  // persistance.
	
	public void exe() {
		
		int c =100;   // local variable   // Reinitialize from the first
		
		System.out.println("A value is" + " " + ++a);
		
		System.out.println("B Value is " + " " + ++b);
		
		System.out.println("C Value is "+ " "+ ++c);
		
	}
	 
	public static void main(String[] args) {
		
		 
		
		StaticAndNonStaticVar s =  new StaticAndNonStaticVar();
		
		s.exe();
		
        StaticAndNonStaticVar s1 =  new StaticAndNonStaticVar();  /*When we are creating new new object  for the class and access the instance variable the value taken from the 
                                                                          starting point. (Multiple copies ) */
		
		s1.exe();
		
       StaticAndNonStaticVar s2 =  new StaticAndNonStaticVar();
		
		s2.exe();
		
	}
			}


