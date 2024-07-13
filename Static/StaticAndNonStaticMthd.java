package Static;

public class StaticAndNonStaticMthd {
	
	short a = 100;
	
	static  short b = 300;
	
	public static int  Name() {
		                           // Non static variable cant be used in the static method.  this keyword is also not used
		 return b;
		 
		
	}
	
	public int  CheckTf() {
		
		System.out.println(b);
		                       // But here both the static and the non static can be accessed in the non static methods.

		return a;
		
		
		
	}

	public static void main(String[] args) {
		
		
		StaticAndNonStaticMthd q = new StaticAndNonStaticMthd();
		
		q.Name();  // Shows warning when the static method  cant accessed by the object.
		
		System.out.println(q.CheckTf());
		
	
	}

}
