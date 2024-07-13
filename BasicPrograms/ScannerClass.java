package BasicPrograms;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		sc.nextInt();
		
	System.out.println("ENTER THE VALUES \n 1.ADD \n 2.SUB \n 3.MUL \n 4.DIV"); // Escape sequence it will jump to next line
		
		int choice  = sc.nextInt();
		
		 
		
		switch(choice) {
		
		case 1 : {
			
			System.out.println("Enter the value of a");
			
			int a = sc.nextInt();
			
           System.out.println("Enter the value of b");
			
			int b = sc.nextInt();
			
			System.out.println("ADD IS" +" "+ (a+b));
			
			break;
			
			 }
		
	case 2 : {
			
			System.out.println("Enter the value of c");
			
			float c = sc.nextFloat();
			
           System.out.println("Enter the value of d");
			
			float d = sc.nextFloat();
			
			System.out.println("SUB IS" +" "+ (c-d));
			
			break;
			
			 }
	
	case 3 : {
		
		System.out.println("Enter the value of e");
		
		double e = sc.nextDouble();
		
        System.out.println("Enter the value of f");
		
		double f = sc.nextDouble();
		
		System.out.println("MUL IS" + " "+(e*f));
		
		break;
		
		 }
	
	
	case 4 : {
		
		System.out.println("Enter the value of g");
		
		char g = sc.next().charAt(0);
		
       System.out.println("Enter the value of h");
		
		char h = sc.next().charAt(0);
		
		System.out.println("DIV IS" + " "+(g+h));
		
		 
	 break;
	
	}
		
		
		
		
		
			
		}
		

	}
}

