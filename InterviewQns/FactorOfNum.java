package InterviewQns;

import java.util.Scanner;

public class FactorOfNum {

	public static void main(String[] args) {
		
   Scanner sc = new Scanner(System.in);
   
   System.out.println("Enter the value of a");
   
    int a = sc.nextInt();
    
    for(int i =1 ; i<=a ; i++) {
    	
    	if(a%i==0) {
    		
    		System.out.println("The factors are"+(i));
    	}
    }

	}

}
