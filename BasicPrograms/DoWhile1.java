package BasicPrograms;

public class DoWhile1 {

	public static void main(String[] args) {
		
		  int i = 31 , sum1 = 0 ; 
		    
		    do {
		    	
		    	sum1= sum1 +i;
		    	
		    	i++;
		    }
		    
		    while(i<=40);
		    
		    System.out.println(sum1);
		    
		    
		    
          char i1 = 'A'; 
		    
		    do {
		    	
		    int a = i1; // without Type casting char into integer. 
		    
		    System.out.println(a);
		    	
		    	i1++;
		    }
		    
		    while(i1<='B');
		 
		    
   int  q = 68; 
		    
		    do {
		    	
		    char  a = (char)(q); // with Type casting integer into Character. 
		    
		    System.out.println(a);
		    	
		    	q++;
		    }
		    
		    while(q<=89);
		    
		    
	}

	}


