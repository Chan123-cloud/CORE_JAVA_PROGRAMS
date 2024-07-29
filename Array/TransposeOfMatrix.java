  package Array;


    
     import java.util.Scanner;

    public class TransposeOfMatrix {
    	
	
	public static void main(String[] args) {
		
		
	 Scanner sc = new Scanner(System.in);
	 
	
    System.out.println("ENTER THE NUMBER OF THE ROWS");
	
	int row = sc.nextInt();
	
	
   System.out.println("ENTER THE NUMBER OF THE COLOUMNS");
   
   int col = sc.nextInt();
   
   
   int a[][]= new int[row][col];
   
   
   System.out.println("ENTER THE VALUES FOR THE  ROWS and COLS");
   
   
   for(int i =0; i<a.length; i++) {
  	 
  	 for( int j =0; j<a[i].length; j++) {
  		 
  	  a[i][j] = sc.nextInt();
  	  
  	 }
  	 
   }
   
   System.out.println("I AM PRINTING THE VALUES");           // Two ways we can give by length or by size
   
   
     for(int i = 0; i<row; i++) {
    	 
    	 for( int j = 0; j<col; j++) {
    		 
    		 System.out.println(a[j][i]);
		   
		  
	   }
    	 
    	 System.out.println();
    	 
    	
    	 
    	 
    	 
    	
    	 
    	
    	 
    	 
   }
	
	
	


	}

}
