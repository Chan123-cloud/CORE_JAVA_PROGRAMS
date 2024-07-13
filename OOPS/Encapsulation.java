package OOPS;

public class Encapsulation {
	
   private int a ;
	
   private boolean b;  
	
	 String s ; // We can declare here or we can pass it in the parameters.
	

	 public  int getA() {
		
		System.out.println(a);
		  
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}



	public boolean isB() {
		return b;
	}



	public  void setB(boolean b) {
		this.b = b;
	}




	public String getS() {
		return s;
	}

 


	public void setS(String s) {
		this.s = s;
	}

}



	