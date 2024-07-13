package Constructor;

public class ParameterizedConstructor {
	
	int a;
	
	boolean b;
	
	static int q;
	
	ParameterizedConstructor(int a , boolean b){  // values are passed in the parameters So it is parameterized constructors.
		
		this.a=a;
		
		this.b=b;
		
		this.q =123; // this keyword for the static variables is also assigned inside the constructor.
	}
	
	
	public void  print() {
		
		System.out.println(a);
		
	}                             // Method overloading concept also used in the Constructors.
	
    public void  print(boolean b) {
	 	
		System.out.println(b);
	}
	

	public static void main(String[] args) {
		
		ParameterizedConstructor A = new ParameterizedConstructor(10,true);
		
		A.print(true);
		
		
		

	}

}
