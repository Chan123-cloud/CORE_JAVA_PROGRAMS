package Exception_Handling;

public class Number_Format_Unchecked_Exception {
	
	
	public static void main(String[] args) {
	
	
	String a ="true";            // Number format Exception happens doesnot given a proper value in string
	
	int  A = Integer.parseInt(a);         // It is a part of Ilegal format Exception.
	
	System.out.println(A);
	
	

}
}
