package Array;

public class SecMaxEleInArr {
	
	public static void main(String[] args) {
		
		int d [] = {6,20,10,234,90,43,65,6};
		
		if (d.length<2) {
			
			System.out.println("THERE IS NO SECOND MAX ELEMENT IN THE ARRAY");
			
		}
		
		 int FirstMax = Integer.MIN_VALUE;
		 
		 int SecondMax = Integer.MIN_VALUE;
		 
		 for (int a : d) {
			 
			 if (a>FirstMax) {
				 
				 SecondMax = FirstMax;
				 
				 FirstMax = a;
			 }
			 
			 
			 
             else if (a>SecondMax && a<FirstMax) {
            	 
            	 
            	 SecondMax = a;
			 }
		 }
		 
		 if (SecondMax == Integer.MIN_VALUE) {
			 
			 	System.out.println("THERE IS NO SECOND HIGHEST ELEMENT");
		 }
		 
		 else {
			 
			 System.out.println("THE SECOND MAX ELEMENT IS"+" "+ SecondMax);
		 }
		
	} 

}
