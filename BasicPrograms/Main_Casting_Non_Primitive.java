package BasicPrograms;

public class  Main_Casting_Non_Primitive {
	
	public static void main(String[] args) {
		
	pen_Non_Primitive_Casting  A = new pen_Non_Primitive_Casting ("PARKER",3224.3232),B;
		
	B=A;
		
	System.out.println(A.Brand);
	
	System.out.println(B.Brand);
	
	System.out.println(A.Price);
	
	System.out.println(B.Price);
	
	System.out.println(A==B);
	
	System.out.println("=========================");
	
	Book_Non_Primitive_Casting C = new Book_Non_Primitive_Casting("PERSISTANCE",32234.3232f),D;
	
	D=C;
	
	System.out.println(C.title);
	
	System.out.println(D.title);
	
	System.out.println(C.Price);
	
	System.out.println(D.Price);
	
	System.out.println(C==D);
	
   
	
	}

}
