package BasicPrograms;

public class Break {
	
	public static void main(String[] args) {
		
	int i = 20 , j = 30;
	
	do {
		
		System.out.println(i);
		
		if(i==25) {
	
		break;  // After the 25 if will goes out of the loop and execute the outside statements.
		
		}
		
	i++;
	}
	
   while(i<=j);
	
	System.out.println("REMAING VALUES ARE NOT PRINTED");
	
	}

}
