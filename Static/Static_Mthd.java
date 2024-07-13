package Static;

public class Static_Mthd {
	
	static int a = 100;
	
    String s ="chandra kumar M";
    
    public static  void print() {
    	
    	
    	Static_Mthd B = new Static_Mthd();  // Created the object for the customized static methods to acess the non static variable.
    	
    	System.out.println(B.s);
    	
    	System.out.println(a);
    }

   public static void main(String[] args) {
	
	   Static_Mthd.print();
}
   
    }

