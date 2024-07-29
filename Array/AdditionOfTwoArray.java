package Array;

import java.util.Scanner;


  public class AdditionOfTwoArray {
	
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("ENTER THE NO OF THE ROWS FOR 1st TWO DIM ARRAY");
	
	int row1 = sc.nextInt();
	
	System.out.println("ENTER THE NO OF THE COLS FOR 1st TWO DIM ARRAY");
	
	int col1 = sc.nextInt();
	
    System.out.println("ENTER THE NO OF THE ROWS FOR 2nd TWO DIM ARRAY");
	
	int row2 = sc.nextInt();
	
	System.out.println("ENTER THE NO OF THE COLS FOR 2nd TWO DIM ARRAY");
	
	int col2 = sc.nextInt();
	
	System.out.println("ENTER THE NO OF THE ROWS FOR 3rd TWO DIM ARRAY");
		
    int rows = sc.nextInt();
		
    System.out.println("ENTER THE NO OF THE COLS FOR 3rd TWO DIM ARRAY");
		
	
	int cols = sc.nextInt();
	
	
	int a[][] = new int [row1][col1];
	
	int b[][] =  new int [row2][col2];
	
	int c[][] = new int [rows][cols];
	
	System.out.println("ENTER THE VALUES FOR THE 1 ST ARRAY");
	
	
	for( int i = 0 ;i < a.length; i++) {
		
		for(int j = 0 ; j <a[i].length; j++) {
			
			 a[i][j] = sc.nextInt();
		}
		
		}
	
	System.out.println("ENTER THE VALUES FOR THE 2 ND ARRAY");
	
     for( int i= 0 ;i< b.length; i++) {
		
		for(int j= 0 ; j<b[i].length; j++) {
			
			 b[i][j] = sc.nextInt();
		}
		
		}
     
     for(int i=0 ; i<c.length; i++)	{
    	 
    	 for( int j =0 ;j<c[i].length; j++ ) {
    		 
    		 c[i][j] = a[i][j] +b[i][j];       // We can do the ADD, SUB, MUL AND DIV
    	 }
     }                                        // IT WILL WORKS IF THE NUMBER OF THE ROWS AND COLS ARE SAME IN BOTH ARRAYS. 
     
     for(int i=0 ; i<c.length; i++)	{
    	 
    	 for( int j =0 ;j<c[i].length; j++ ) {
    		 
    		 System.out.println(c[i][j]+"  ");
    		 
    		 
    	 }
    	 
    	 	System.out.println();
     }
     
     
	}
	
	
	

}
