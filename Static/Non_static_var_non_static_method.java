package Static;

public class Non_static_var_non_static_method {
	
	int a = 100; // from 0 to 100

	public static void main(String[] args) {
	
		Non_static_var_non_static_method A = new Non_static_var_non_static_method();  // CLASS WILL BE LOADED AND THE NON STATIC THINGS WILL EXECUTE FROM TOP TO BOTTOM.
		
		

	}
	
	{
		System.out.println(a);
	}

}
