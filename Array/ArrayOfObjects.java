package Array;

import java.util.Arrays;

public class ArrayOfObjects {


	public ArrayOfObjects(int i, String string, double d) {
		
		age = i;
		
		name = string;
		
		Salary = d;
	}
	
	

	int age;
	
	String name;
	
	double Salary;
	
	
	public String toString() {
		
		return "VALUES ARE"+" "+ age+ " "+ name+" "+ Salary;
	}
	
	
public static void main(String[] args) {
		
		ArrayOfObjects A [] = new ArrayOfObjects[4];
				
			A[0]  =   new ArrayOfObjects(22,"CHANDRA KUMAR" , 35000.0000);
		
		    A[1]  =   new ArrayOfObjects(21, "CHANDRU" , 31000.00000);
	 
		    A[2]  =   new ArrayOfObjects(20, "KARTHIK" , 36000.00000);
		        
		    A[3]  =   new ArrayOfObjects(24  ,"SIVA", 37000.00000);
		    
		    System.out.println(Arrays.toString(A)+" ");
		    
		   for(ArrayOfObjects S:A){
			   
			   System.out.println(S);
			   
			   
		   }
		    
		    }
	}
		
		




	
	
	
	

